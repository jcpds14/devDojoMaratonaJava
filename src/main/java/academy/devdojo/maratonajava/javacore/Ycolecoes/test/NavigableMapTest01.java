package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("C", "Cherry");
        map.put("D", "Durian");
        map.put("E", "Eggplant");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
// lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println(map.headMap("C", true));

    }
}