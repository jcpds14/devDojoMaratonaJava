package academy.devdojo.maratonajava.javacore.RDatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano()); // 999.999.999 após esse valor é 1 segundo
        System.out.println(Instant.ofEpochSecond(3));
        System.out.println(Instant.ofEpochSecond(3,2));
        System.out.println(Instant.ofEpochSecond(3,2_000_000_000));
    }
}