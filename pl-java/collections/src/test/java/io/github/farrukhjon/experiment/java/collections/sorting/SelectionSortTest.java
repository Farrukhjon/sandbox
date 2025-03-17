package io.github.farrukhjon.experiment.java.collections.sorting;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    public void testSelectionSortSolution1() {
        SelectionSort<String> selectionSortImplSolution1 = new SelectionSortImplSolution1<>();

        String[] array = {"D", "A", "C", "B"};

        selectionSortImplSolution1.sort(array);

        String[] sortedStrArray = {"A", "B", "C", "D"};
        assertArrayEquals(sortedStrArray, array);

        SelectionSort<Integer> intSelectionSortImplSolution1 = new SelectionSortImplSolution1<>();
        Integer[] ints = {0, 9, 3, 7, 8, 5, 4, 2, 1, 6};

        Integer[] sortedInts = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        intSelectionSortImplSolution1.sort(ints);

        assertArrayEquals(sortedInts, ints);
    }
}
