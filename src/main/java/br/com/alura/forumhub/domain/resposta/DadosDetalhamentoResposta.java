package br.com.alura.forumhub.domain.resposta;

import br.com.alura.forumhub.domain.topico.Topico;
import br.com.alura.forumhub.domain.usuario.Usuario;

import java.time.LocalDateTime;

public record DadosDetalhamentoResposta(Long id, String mensagem, LocalDateTime data, String solucao, String topico, String Usuario) {
    public DadosDetalhamentoResposta(Resposta resposta) {
        this(resposta.getId(), resposta.getMensagem(), resposta.getData(), resposta.getSolucao(), resposta.getTopico().getTitulo(), resposta.getUsuario().getLogin());
    }
}
