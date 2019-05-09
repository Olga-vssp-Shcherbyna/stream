package com.Fay;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class task_1_2 {

    static String oddNames(List<String> names) {
        return names.stream()
                .filter(name -> names.indexOf(name) % 2 == 0)
                .map(name -> names.indexOf(name) + 1 + "." + name)
                .collect(Collectors.joining(", "));
    }

    static List<String> capitalizeSort(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Katy");
        names.add("Alice");
        names.add("Alex");
        names.add("Andrew");
        System.out.println(oddNames(names));
        System.out.println(capitalizeSort(names));
    }
}
