package academy.devdojo.maratonajava.javacore.Bintrometodos.test;

import academy.devdojo.maratonajava.javacore.Bintrometodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(10, 0);
        System.out.println(result);
        double result2 = calculadora.divideDoisNumeros2(10, 0);
        System.out.println(result2);
        calculadora.imprimeDivisaoDeDoisNumeros(10,0);
    }
}