package academy.devdojo.maratonajava.javacore.Oexcecoes.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        //Exceções mais genéricas devem ser implementadas por último pois a exceção capturada vai buscar o código que
        //estiver mais próximo da exceção

        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (RuntimeException e) {
            System.out.println("Dentro da RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void talvezLanceException() throws SQLException, FileNotFoundException {

    }

}