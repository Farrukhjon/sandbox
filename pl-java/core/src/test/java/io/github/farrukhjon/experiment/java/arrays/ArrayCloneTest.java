package io.github.farrukhjon.experiment.java.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayCloneTest {

    @Test
    void testCloneMethod() {
        int[] origArray = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] cloneArray = origArray.clone();
        Assertions.assertArrayEquals(origArray, cloneArray);
    }

    @Test
    void testSystemArrayCopy() {
        int[] origArray = {0, 1, 2, 3, 4, 5, 6, 7};
        int lengthOfCopy = 3;
        int[] copyArray = new int[lengthOfCopy];

        System.arraycopy(origArray, 0, copyArray, 0, lengthOfCopy);

        Assertions.assertArrayEquals(new int[]{0, 1, 2}, copyArray);
    }
}
