package io.github.farrukhjon.experiment.algorithms;
/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */


import static java.lang.System.arraycopy;

public class UnionTwoArrays {

    public String[] union(final String[] firstArray, final String[] secondArray) {
        int lengthOfFirstArray = firstArray.length;
        int lengthOfSecondArray = secondArray.length;
        int lengthOfUnionisedArray = lengthOfFirstArray + lengthOfSecondArray;
        String[] unionisedArray = new String[lengthOfUnionisedArray];
        arraycopy(firstArray, 0, unionisedArray, 0, lengthOfFirstArray);
        arraycopy(secondArray, 0, unionisedArray, lengthOfFirstArray, lengthOfSecondArray);
        return unionisedArray;
    }

    public static void main(String[] args) {
        String[] a1 = {"C", "F", "D", "E", "F", "C", "C", "D", "E"};
        String[] a2 = {"A", "X"};
        UnionTwoArrays unionTwoArrays = new UnionTwoArrays();
        String[] union = unionTwoArrays.union(a1, a2);
        for (String s : union) {
            System.out.println(s);
        }
    }

}
