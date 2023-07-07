package academy.devdojo.maratonajava.javacore.Oexcecoes.runtime.test;

import java.io.IOException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
            divisao(1,0);

        System.out.println("Código finalizado!");

    }

    /**
     *
     * @param a
     * @param b - não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    public static double divisao(double a, double b){
        if(b == 0){
            throw new IllegalArgumentException("Divisor não pode ser zero");
        }
        return a/b;
    }
}