package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class OrderById implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Naruto", 19.99));
        mangas.add(new Manga(1L, "One Piece", 29.99));
        mangas.add(new Manga(3L, "Dragon Ball", 39.99));
        mangas.add(new Manga(2L, "Bersek", 49.99));
        mangas.add(new Manga(4L, "Attack on Titan", 59.99));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("----------------");
        System.out.println("Mangas ordenadas:");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("----------------");
        System.out.println("Mangas ordenadas por Id:");
        mangas.sort(new OrderById());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}