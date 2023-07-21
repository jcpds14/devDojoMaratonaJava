package academy.devdojo.maratonajava.javacore.RDatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23,32,12);
        LocalTime agora = LocalTime.now();

        System.out.println(time);
        System.out.println(agora);
        System.out.println(agora.getHour());
        System.out.println(agora.getMinute());
        System.out.println(agora.getSecond());
    }
}