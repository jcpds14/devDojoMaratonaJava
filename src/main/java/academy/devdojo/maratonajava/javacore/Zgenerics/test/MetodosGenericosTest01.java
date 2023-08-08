package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.List;

public class MetodosGenericosTest01 {
    public static void main(String[] args) {
        List<Barco> barcosDisponiveis = List.of(new Barco("Lancha"), new Barco("Iate"));
        System.out.println(barcosDisponiveis);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }
}