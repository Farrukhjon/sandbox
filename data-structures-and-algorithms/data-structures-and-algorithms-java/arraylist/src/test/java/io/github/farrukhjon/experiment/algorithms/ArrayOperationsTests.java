package io.github.farrukhjon.experiment.algorithms;
/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */



import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTests {

    /**
     * Array under test
     */
    private String[] aut = null;

    @BeforeEach
    public void setUp() {
        aut = new String[]{"Ali", "Vali", "Sami", "Gani", "Surayo", "Muhayo"};
    }

    @Test
    public void arrayInitialized() {
        assertTrue(aut.length > 0);
    }

    @Test
    public void shouldTestDeletingElementByIndexFromArray() {
        int[] a = new int[]{1, 2, 3, 4};
        int lengthBefore = a.length;
        int deleteElement = ArrayOperations.delete(a, 2);
        int lengthAfter = a.length;
        assertTrue(lengthBefore > lengthAfter);
    }

    @Test
    public void testCopyOf() {
        String[] newArray = Arrays.copyOf(aut, aut.length - 1);
        assertTrue(newArray.length < aut.length);
    }
}
