package br.com.alura.forumhub.domain.topico;

import java.time.LocalDateTime;

public record DadosDetalhamentoCadastroTopico (Long id, String titulo, String mensagem, LocalDateTime data, String curso) {
    public DadosDetalhamentoCadastroTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getData(), topico.getCurso());
    }
}
