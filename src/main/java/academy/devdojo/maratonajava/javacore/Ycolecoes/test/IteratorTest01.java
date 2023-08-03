package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();//é melhor pra remover itens do que ArraysList
        mangas.add(new Manga(5L, "Naruto", 19.99,0));
        mangas.add(new Manga(1L, "One Piece", 29.99,5));
        mangas.add(new Manga(3L, "Dragon Ball", 39.99,0));
        mangas.add(new Manga(2L, "Bersek", 49.99,2));
        mangas.add(new Manga(4L, "Attack on Titan", 59.99,0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantity() == 0){
//                mangaIterator.remove();
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantity() == 0);
        System.out.println(mangas);

    }
}