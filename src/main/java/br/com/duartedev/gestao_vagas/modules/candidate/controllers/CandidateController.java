package br.com.duartedev.gestao_vagas.modules.candidate.controllers;


import br.com.duartedev.gestao_vagas.exceptions.UserFoundExceptionDTO;
import br.com.duartedev.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.duartedev.gestao_vagas.modules.candidate.CandidateRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    private final CandidateRepository candidateRepository;

    @Autowired
    public CandidateController(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @PostMapping("/")
    public CandidateEntity create(@Valid @RequestBody CandidateEntity candidate) {
        this.candidateRepository
                .findByUsernameOrEmail(candidate.getUsername(), candidate.getEmail())
                .ifPresent((_)->{
                    throw new UserFoundExceptionDTO();
                });
        return this.candidateRepository.save(candidate);
    }

}
