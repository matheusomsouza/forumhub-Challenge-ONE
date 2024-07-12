package br.com.alura.forumhub.controller;

import br.com.alura.forumhub.domain.resposta.DadosCadastroResposta;
import br.com.alura.forumhub.domain.resposta.RespostaRepository;
import br.com.alura.forumhub.domain.resposta.RespostasCadastradas;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("respostas")

public class RespostaController {
    @Autowired
    private RespostaRepository repository;

    @Autowired
    private RespostasCadastradas resposta;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrarResposta(@RequestBody @Valid DadosCadastroResposta dados) {
        var dto = resposta.cadastrar(dados);
        return ResponseEntity.ok(dto);
    }
}
