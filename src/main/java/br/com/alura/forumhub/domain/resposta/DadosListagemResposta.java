package br.com.alura.forumhub.domain.resposta;

import br.com.alura.forumhub.domain.topico.Topico;

import java.time.LocalDateTime;

public record DadosListagemResposta(String solucao, LocalDateTime data) {
    public DadosListagemResposta(Resposta resposta) {
        this(resposta.getSolucao(), resposta.getData());
    }
}
