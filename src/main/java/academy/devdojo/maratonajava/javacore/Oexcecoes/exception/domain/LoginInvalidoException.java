package academy.devdojo.maratonajava.javacore.Oexcecoes.exception.domain;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        System.out.println("Login Inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}