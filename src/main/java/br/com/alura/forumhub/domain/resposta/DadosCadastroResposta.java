package br.com.alura.forumhub.domain.resposta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosCadastroResposta(@NotBlank
                                    String solucao,
                                    @NotNull
                                    Long idTopico,
                                    @NotNull
                                    Long idUsuario) {
}
