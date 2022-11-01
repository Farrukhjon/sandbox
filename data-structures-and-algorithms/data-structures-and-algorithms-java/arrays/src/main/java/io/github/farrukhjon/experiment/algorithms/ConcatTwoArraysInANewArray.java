package io.github.farrukhjon.experiment.algorithms;
/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */


import java.util.Arrays;
import java.util.stream.Stream;

import static java.lang.System.arraycopy;

public class ConcatTwoArraysInANewArray {

    public static void main(String[] args) {
        String[] maleNames = {"Ali", "Vali", "Sami", "Gani", "Jomi"};
        String[] femaleName = {"Salomat", "Ibidat", "Karomat"};

        String[] allNames = concatByArraysCopyOfAndSystemArrayCopy(maleNames, femaleName);
        print(allNames);

        String[] allNamesConcatenatedByStreamConcatMethod = concatByStreamConcatApi(maleNames, femaleName);
        print(allNamesConcatenatedByStreamConcatMethod);

        String[] allNamesConcatenatedByStreamByFlatMap = concatByStreamFlatMapApi(maleNames, femaleName);
        print(allNamesConcatenatedByStreamByFlatMap);
    }

    public static String[] concatByArraysCopyOfAndSystemArrayCopy(String[] firstArray, String[] secondArray) {
        int lengthOfFirstArray = firstArray.length;
        int lengthOfSecondArray = secondArray.length;
        int lengthOfUnionisedArray = lengthOfFirstArray + lengthOfSecondArray;
        String[] unionisedArray = Arrays.copyOf(firstArray, lengthOfUnionisedArray);
        System.arraycopy(secondArray, 0, unionisedArray, lengthOfFirstArray, lengthOfSecondArray);
        return unionisedArray;
    }

    public static String[] concatByArraysCopyOfAndSystemArrayCopy2(String[] firstArray, String[] secondArray) {
        int lengthOfFirstArray = firstArray.length;
        int lengthOfSecondArray = secondArray.length;
        int lengthOfUnionisedArray = lengthOfFirstArray + lengthOfSecondArray;
        String[] unionisedArray = new String[lengthOfUnionisedArray];
        arraycopy(firstArray, 0, unionisedArray, 0, lengthOfFirstArray);
        arraycopy(secondArray, 0, unionisedArray, lengthOfFirstArray, lengthOfSecondArray);
        return unionisedArray;
    }

    public static String[] concatByStreamConcatApi(String[] firstArray, String[] secondArray) {
        return Stream.concat(Arrays.stream(firstArray), Arrays.stream(secondArray))
                .toArray(String[]::new);
    }

    public static String[] concatByStreamFlatMapApi(String[] firstArray, String[] secondArray) {
        return Stream.of(firstArray, secondArray)
                .flatMap(Stream::of)
                .toArray(String[]::new);
    }

    private static void print(String[] names) {
        System.out.println("----------------------------");
        for (String name : names) {
            System.out.println(name);
        }
    }

}
