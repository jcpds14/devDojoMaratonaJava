package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Smartphone;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Televisao;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Sony Vaio", 3300);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());
        System.out.println("\n----------------------\n");
        Produto produto2 = new Smartphone("Mi A3", 1000);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("\n----------------------\n");
        Produto produto3 = new Televisao("Samsung 50\" ", 5000);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

    }
}