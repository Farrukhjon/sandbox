package io.github.farrukhjon.experiment.java.streams;

import java.util.stream.Stream;

public class SkipLimitDemo {

    public static void main(String[] args) {
        Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
                .skip(7)
                .limit(2)
                .forEach(System.out::println);
    }

}
