package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Smartphone;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadorImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador pc = new Computador("DELL i7", 10000);
        Smartphone smartphone = new Smartphone("Mi 12", 8000);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);
        CalculadorImposto.calcularImposto(pc);
        System.out.println("-----------------");
        CalculadorImposto.calcularImposto(smartphone);
        System.out.println("-----------------");
        CalculadorImposto.calcularImposto(tv);
    }
}