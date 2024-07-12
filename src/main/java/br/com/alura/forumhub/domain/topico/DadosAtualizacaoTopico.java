package br.com.alura.forumhub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosAtualizacaoTopico(@NotBlank
                                     String titulo,
                                     @NotBlank
                                     String mensagem,
                                     @NotBlank
                                     String curso,
                                     @NotNull
                                     Long id) {
}
