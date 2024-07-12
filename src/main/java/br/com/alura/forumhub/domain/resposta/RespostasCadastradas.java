package br.com.alura.forumhub.domain.resposta;

import br.com.alura.forumhub.domain.topico.TopicoRepository;
import br.com.alura.forumhub.domain.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service

public class RespostasCadastradas {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private RespostaRepository respostaRepository;

    public DadosDetalhamentoResposta cadastrar(DadosCadastroResposta dados) {
        var usuario = usuarioRepository.getReferenceById(dados.idUsuario());
        var topico = topicoRepository.getReferenceById(dados.idTopico());
        var mensagem = topico.getMensagem();
        var resposta = new Resposta(null, mensagem, LocalDateTime.now(), dados.solucao(), topico, usuario);
        respostaRepository.save(resposta);
        return new DadosDetalhamentoResposta(resposta);
    }
}
