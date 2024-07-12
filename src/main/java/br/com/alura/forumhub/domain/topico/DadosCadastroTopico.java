package br.com.alura.forumhub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosCadastroTopico(@NotBlank
                                  String titulo,
                                  @NotBlank
                                  String mensagem,
                                  @NotBlank
                                  String curso,
                                  @NotNull
                                  Long idUsuario) {
}