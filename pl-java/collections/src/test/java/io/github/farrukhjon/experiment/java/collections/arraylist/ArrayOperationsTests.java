package io.github.farrukhjon.experiment.java.collections.arraylist;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayOperationsTests {

    /**
     * Array under test
     */
    private String[] aut = null;

    @BeforeEach
    void setUp() {
        aut = new String[]{"Ali", "Vali", "Sami", "Gani", "Surayo", "Muhayo"};
    }

    @Test
    void arrayInitialized() {
        assertTrue(aut.length > 0);
    }

    @Test
    void shouldTestDeletingElementByIndexFromArray() {
        int[] a = new int[]{1, 2, 3, 4};
        int deleteElement = ArrayOperations.delete(a, 2);
        Assertions.assertEquals(3, deleteElement);
    }

    @Test
    void testCopyOf() {
        String[] newArray = Arrays.copyOf(aut, aut.length - 1);
        assertTrue(newArray.length < aut.length);
    }
}
