package io.github.farrukhjon.experiment.algorithms;
/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */


import java.util.Arrays;
import java.util.NoSuchElementException;

public class MaxElementInArray {

    public static void main(String[] args) {
        int[] array = {1, 3, 10, 1, 7, 9};
        int maxElement = maxElementOfArrayRecursive(array);
        System.out.printf("Maximal element from %s is %s\n", Arrays.toString(array), maxElement);

        int maxElementFrom2 = maxElementOfArrayIterative(array);
        System.out.printf("Maximal element from %s is %s\n", Arrays.toString(array), maxElementFrom2);
    }

    private static int maxElementOfArrayRecursive(int[] array) {
        if (array.length == 0) {
            throw new NoSuchElementException("An Empty array cannot hold a max element");
        }
        if (array.length == 1)
            return array[0];
        int left = 0;
        int right = array.length;
        int mid = (left + right) / 2;
        int maxLeft = findMax(array, left, mid);
        int maxRight = findMax(array, mid, right);

        return Math.max(maxLeft, maxRight);
    }

    /**
     * Recursive approach.
     *
     * @param array
     * @param left
     * @param right
     * @return
     */
    private static int findMax(int[] array, int left, int right) {
        if (right - left == 1)
            return array[left];
        int mid = (left + right) / 2;
        int maxLeft = findMax(array, left, mid);
        int maxRight = findMax(array, mid, right);
        return Math.max(maxLeft, maxRight);
    }

    /**
     * Iterative approach.
     *
     * @param array an array
     * @return max value.
     */
    private static int maxElementOfArrayIterative(int[] array) {
        if (array.length == 0) {
            throw new NoSuchElementException("An Empty array cannot hold a max element");
        }
        int maxElement = array[0];
        for (int item : array) {
            if (maxElement < item)
                maxElement = item;
        }
        return maxElement;
    }

}
