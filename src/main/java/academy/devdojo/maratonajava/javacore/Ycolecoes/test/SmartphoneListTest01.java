package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("123", "Apple");
        Smartphone s2 = new Smartphone("232", "Samsung");
        Smartphone s3 = new Smartphone("3423", "Xiaomi");
        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        for (Smartphone smartphone :
                smartphones) {
            System.out.println(smartphone);
        }
    }
}