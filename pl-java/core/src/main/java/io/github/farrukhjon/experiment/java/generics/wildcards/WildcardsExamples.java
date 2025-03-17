package io.github.farrukhjon.experiment.java.generics.wildcards;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WildcardsExamples {

    public static void main(String[] args) {

        final List<? extends Integer> srcNums = Arrays.asList(100, 200, 300);
        final List<? super Number> destNums = Arrays.asList(100, 3.14, -1, 20L);

        Collections.copy(destNums, srcNums);

        System.out.println(srcNums);
        System.out.println(destNums);

    }
}
