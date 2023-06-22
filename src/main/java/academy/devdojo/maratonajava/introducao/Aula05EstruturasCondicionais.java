package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

//Operador ternário
public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        double salario = 6000;
        String msgDoar = "Eu vou doar 500";
        String msgNDoar = "Eu ainda não tenho condições de doar";

        String resultado = salario > 5000 ? msgDoar : msgNDoar;

        System.out.println(resultado);
    }
}