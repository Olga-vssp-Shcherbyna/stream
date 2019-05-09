package com.Fay;

import java.util.stream.Stream;

public class task4 {
    static void pseudoRandomNumberGenerator(long a, long c, long m, long seed) {
        Stream.iterate(seed, n -> (a * n + c) % m)
                .limit(34)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        pseudoRandomNumberGenerator(25214903917L, 11, 2 ^ 48, 3);
    }
}
