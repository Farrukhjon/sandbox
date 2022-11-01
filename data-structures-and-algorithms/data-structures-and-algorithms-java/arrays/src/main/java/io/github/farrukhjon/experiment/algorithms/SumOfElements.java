package io.github.farrukhjon.experiment.algorithms;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.LongStream;

public class SumOfElements {

    public static void main(String[] args) throws IOException {
        long[] lngArray = parseStrArgsToLongArray(args);
        long result = LongStream.of(lngArray)
                .sum();
        System.out.println(result);
    }

    private static long[] parseStrArgsToLongArray(String[] args) {
        return Arrays
                .stream(args)
                .mapToLong(Long::parseLong)
                .toArray();
    }

}
