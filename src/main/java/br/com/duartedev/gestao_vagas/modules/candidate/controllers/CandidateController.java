package br.com.duartedev.gestao_vagas.modules.candidate.controllers;


import br.com.duartedev.gestao_vagas.exceptions.UserFoundExceptionDTO;
import br.com.duartedev.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.duartedev.gestao_vagas.modules.candidate.useCases.CreateCandidateUseCase;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    private final CreateCandidateUseCase createCandidateUseCase;

    public CandidateController(CreateCandidateUseCase createCandidateUseCase) {
        this.createCandidateUseCase = createCandidateUseCase;
    }

    @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody CandidateEntity candidate) {

        var result = this.createCandidateUseCase.execute(candidate);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @ExceptionHandler(UserFoundExceptionDTO.class)
    public ResponseEntity<Object> handleUserFoundException(UserFoundExceptionDTO e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
