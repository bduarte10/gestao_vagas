package br.com.duartedev.gestao_vagas.exceptions;

public class UserFoundExceptionDTO extends RuntimeException{
    public UserFoundExceptionDTO() {
        super("Usuário ja existe");
    }
}
