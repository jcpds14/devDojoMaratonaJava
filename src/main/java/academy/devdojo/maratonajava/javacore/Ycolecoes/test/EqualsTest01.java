package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("123", "Apple");
        Smartphone s2 = new Smartphone("123", "Apple");
        System.out.println(s1.equals(s2));
    }
}