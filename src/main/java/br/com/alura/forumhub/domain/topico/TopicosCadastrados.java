package br.com.alura.forumhub.domain.topico;

import br.com.alura.forumhub.domain.resposta.Resposta;
import br.com.alura.forumhub.domain.resposta.RespostaRepository;
import br.com.alura.forumhub.domain.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service

public class TopicosCadastrados {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private TopicoRepository topicoRepository;

    public DadosDetalhamentoCadastroTopico cadastrar(DadosCadastroTopico dados) {
        var usuario = usuarioRepository.getReferenceById(dados.idUsuario());
        var topico = new Topico(null, dados.titulo(), dados.mensagem(), LocalDateTime.now(), true, dados.curso(), usuario, null);
        topicoRepository.save(topico);
        return new DadosDetalhamentoCadastroTopico(topico);
    }
}
