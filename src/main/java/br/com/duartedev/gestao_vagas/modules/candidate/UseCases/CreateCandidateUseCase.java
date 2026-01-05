package br.com.duartedev.gestao_vagas.modules.candidate.UseCases;

import br.com.duartedev.gestao_vagas.exceptions.UserFoundExceptionDTO;
import br.com.duartedev.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.duartedev.gestao_vagas.modules.candidate.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCandidateUseCase {


    private final CandidateRepository candidateRepository;

    @Autowired
    public CreateCandidateUseCase(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public CandidateEntity execute(CandidateEntity candidateEntity) {
        this.candidateRepository
                .findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
                .ifPresent((_) -> {
                    throw new UserFoundExceptionDTO();
                });
        return this.candidateRepository.save(candidateEntity);
    }
}
