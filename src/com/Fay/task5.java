package com.Fay;

import java.util.Iterator;
import java.util.stream.Stream;

public class task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();
        Stream<T> alterStream = Stream.empty();
        while (iterator1.hasNext() & iterator2.hasNext()) {
            alterStream = Stream.concat(alterStream, Stream.of(iterator1.next(), iterator2.next()));
        }
        return alterStream;
    }

    public static void main(String[] args) {
        Stream<String> stringStream1 = Stream.of("nyan", "nyan", "nyan");
        Stream<String> stringStream2 = Stream.of("pony", "unicorn", "pegasus");
        zip(stringStream1, stringStream2).forEach(System.out::println);
    }
}
