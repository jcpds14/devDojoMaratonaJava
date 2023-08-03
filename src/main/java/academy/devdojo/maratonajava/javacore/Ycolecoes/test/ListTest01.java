package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(); //era feito sem diamond que define o tipo até a versão 1.4 do java
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Jean");
        nomes.add("DevDojo");
        nomes2.add("Carlos");
        nomes2.add("Academy");

        nomes.addAll(nomes2);

        for (Object nome :
                nomes) {
            System.out.println(nome);
        }
        System.out.println("----------------");
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
    }
}