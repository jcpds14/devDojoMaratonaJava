package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Naruto");
        mangas.add("One Piece");
        mangas.add("Dragon Ball");
        mangas.add("Bersek");
        mangas.add("Attack on Titan");

        Collections.sort(mangas);//organiza por ordem alfabética neste caso

        for (String manga : mangas) {
            System.out.println(manga);
        }

    }
}