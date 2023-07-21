package academy.devdojo.maratonajava.javacore.RDatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }

        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_YEAR);
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);

//        calendar.add(Calendar.DAY_OF_MONTH, 2);
//        calendar.roll(Calendar.HOUR, 10);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}