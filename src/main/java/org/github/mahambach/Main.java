package org.github.mahambach;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            numbers.add(random.nextInt(20));
        }
        // Step 1:
        numbers = List.of(12, 17, 10, 14, 18, 4, 7, 10, 9, 10, 2, 7, 13, 2, 6, 2, 6, 6, 9);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        //Step 2:
        List<Integer> doubledNumbers = numbers.stream()
                .map(n-> 2 * n)
                .toList();


        //Step 3:
        //Ascending order.
        List<Integer> sortedList = numbers.stream()
                        .sorted()
                        .toList();

        //Descending order
        List<Integer> sortedList2 = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        //Alternative descending order
        List<Integer> sortedList3 = numbers.stream()
                .sorted((a,b) -> b-a)
                .toList();

        System.out.println(numbers);
        System.out.println(evenNumbers);
        System.out.println(doubledNumbers);
        System.out.println(sortedList);
        System.out.println(sortedList2);
        System.out.println(sortedList3);
    }
}