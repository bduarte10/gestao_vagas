package br.com.duartedev.gestao_vagas.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;


@Data
public class CandidateEntity {

    private UUID id;

    private String name;


    @Pattern(regexp = "^[a-zA-Z0-9._]+$", message = "O username deve conter apenas letras, números, pontos ou underline")
    private String username;

    @Email(message = "O campo email deve conter um e-mail válido")
    private String email;

    @Length(min = 10, max = 100, message = "A senha deve conter entre 10 a 100 caracteres")
    private String password;

    private String description;
    private String curriculum;

}
