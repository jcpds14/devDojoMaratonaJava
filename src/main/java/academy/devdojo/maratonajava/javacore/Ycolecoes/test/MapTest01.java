package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("momitor", "monitor");
        map.putIfAbsent("muuse", "mouse");
        System.out.println(map);

        for (String key :
                map.keySet()) {
            System.out.println(key);
        }
        System.out.println("======================");
        for (String value : map.values()) {
            System.out.println(value);
        }
        System.out.println("======================");
        for (Map.Entry<String, String> mapEntry :
                map.entrySet()) {
            System.out.println(mapEntry.getKey() + " - " + mapEntry.getValue());
        }
    }
}