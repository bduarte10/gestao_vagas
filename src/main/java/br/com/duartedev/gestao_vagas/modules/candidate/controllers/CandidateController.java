package br.com.duartedev.gestao_vagas.modules.candidate.controllers;


import br.com.duartedev.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.duartedev.gestao_vagas.modules.candidate.UseCases.CreateCandidateUseCase;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    private final CreateCandidateUseCase createCandidateUseCase;

    public CandidateController(CreateCandidateUseCase createCandidateUseCase) {
        this.createCandidateUseCase = createCandidateUseCase;
    }

    @PostMapping("/")
    public CandidateEntity create(@Valid @RequestBody CandidateEntity candidate) {
        return this.createCandidateUseCase.execute(candidate);
    }
}
