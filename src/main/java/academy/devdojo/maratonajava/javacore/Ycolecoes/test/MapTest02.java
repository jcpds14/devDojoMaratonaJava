package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Lucas");
        Consumidor consumidor2 = new Consumidor("Marcos");

        Manga manga1 = new Manga(5L, "Naruto", 19.99);
        Manga manga2 = new Manga(1L, "One Piece", 29.99);
        Manga manga3 = new Manga(3L, "Dragon Ball", 39.99);
        Manga manga4 = new Manga(2L, "Bersek", 49.99);
        Manga manga5 = new Manga(4L, "Attack on Titan", 59.99);

        Map<Consumidor,Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor, manga1);
        consumidorManga.put(consumidor2, manga5);
        for(Map.Entry<Consumidor,Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getName() + " - " + entry.getValue().getPrice());

        }
    }
}