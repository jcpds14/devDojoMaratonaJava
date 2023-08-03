package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneBrandComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone smart1, Smartphone smart2) {
        return smart1.getBrand().compareTo(smart2.getBrand());
    }
}

class MangaPriceComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return Double.compare(manga1.getPrice(), manga2.getPrice());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneBrandComparator());
        Smartphone smartphone = new Smartphone("399", "Xiaomi");
        set.add(smartphone);

//      TreeSet deve ser utilizado quando a clsse implementa comparable, e lembre-se que será reordenado de acordo
//      com o equals/hashcode da sua implementação, e não aceita itens duplicados usando método CompareTo ou baseado também no
        // equals/hashcode do seu código
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator());
        mangas.add(new Manga(5L, "Naruto", 19.99));
        mangas.add(new Manga(1L, "One Piece", 29.99));
        mangas.add(new Manga(3L, "Dragon Ball", 39.99));
        mangas.add(new Manga(2L, "Bersek", 49.99));
        mangas.add(new Manga(4L, "Attack on Titan", 59.99));
        mangas.add(new Manga(10L, "Aaragon", 22.99));

        for (Manga manga :
                mangas) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(2L, "Yuyu Hakushu", 22.99);
        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("----------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());//remove o primeiro item da lista
        System.out.println(mangas.size());

    }
}