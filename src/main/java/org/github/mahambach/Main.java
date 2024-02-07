package org.github.mahambach;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            numbers.add(random.nextInt(20));
        }
        // Step 1:
        numbers = List.of(12, 17, 10, 14, 18, 4, 7, 10, 9, 10, 2, 7, 13, 2, 6, 2, 6, 6, 9);
        System.out.println(numbers);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(evenNumbers);

        //Step 2:
        List<Integer> doubledNumbers = numbers.stream()
                .map(n-> 2 * n)
                .toList();
        System.out.println(doubledNumbers);


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

        //Step 4:
        int reducedListSum = numbers.stream()
                        .reduce(0, Integer::sum);
        //Reduce to maximum of List.
        int reducedListMax = numbers.stream()
                        .reduce(0, Integer::max);

        System.out.println(sortedList);
        System.out.println(sortedList2);
        System.out.println(sortedList3);
        System.out.println(reducedListSum);
        System.out.println(reducedListMax);
        System.out.println();
        System.out.println();

        //Step 5:
        doubledNumbers.stream()
                .forEach(n -> System.out.println(n));

        //Step 6:
        List<Integer> collected = numbers.stream()
                .filter(n -> n%2==0)
                .map(n->3*n)
                .collect(Collectors.toList());
        System.out.println(collected);

        //As String
        String collectedString = numbers.stream()
                .filter(n -> n%2==0)
                .map(n->3*n)
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        System.out.println(collectedString);

        //Step 7:



    }
}