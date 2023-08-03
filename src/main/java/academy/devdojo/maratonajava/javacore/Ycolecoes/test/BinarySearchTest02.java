package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        OrderById orderById = new OrderById();
        mangas.add(new Manga(5L, "Naruto", 19.99));
        mangas.add(new Manga(1L, "One Piece", 29.99));
        mangas.add(new Manga(3L, "Dragon Ball", 39.99));
        mangas.add(new Manga(2L, "Bersek", 49.99));
        mangas.add(new Manga(4L, "Attack on Titan", 59.99));

//        Collections.sort(mangas);
mangas.sort(new OrderById());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(1L, "One Piece", 29.99);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, orderById));


    }
}