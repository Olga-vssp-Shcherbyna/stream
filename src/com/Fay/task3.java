package com.Fay;

import java.util.Arrays;
import java.util.Collection;

public class task3 {
    static String[] numbersToString(Collection<String> numbers) {
        return numbers.stream()
                .flatMap((p) -> Arrays.stream(p.split(", ")))
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        Collection<String> numbers = Arrays.asList("1, 2, 0", "4, 5");
        System.out.println(Arrays.toString(numbersToString(numbers)));
    }
}
