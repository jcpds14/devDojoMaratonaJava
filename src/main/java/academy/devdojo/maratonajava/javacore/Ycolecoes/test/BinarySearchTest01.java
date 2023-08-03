package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(0);
        numbers.add(3);
        numbers.add(1);
        // (-(ponto de inserção)-1)
        // index = 0, 1, 2, 3, 4
        // value = 2, 4, 0, 3, 1
        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers,2));
    }
}