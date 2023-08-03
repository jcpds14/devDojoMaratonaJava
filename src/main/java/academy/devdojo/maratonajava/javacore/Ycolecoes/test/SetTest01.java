package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Naruto", 19.99));
        mangas.add(new Manga(1L, "One Piece", 29.99));
        mangas.add(new Manga(3L, "Dragon Ball", 39.99));
        mangas.add(new Manga(2L, "Bersek", 49.99));
        mangas.add(new Manga(4L, "Attack on Titan", 59.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}