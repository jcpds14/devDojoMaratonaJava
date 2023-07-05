package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Nami", 5000);
        System.out.println(g1);
        Desenvolvedor d1 = new Desenvolvedor("Naruto", 12000);
        System.out.println(d1);

        d1.imprime();
        g1.imprime();
    }
}