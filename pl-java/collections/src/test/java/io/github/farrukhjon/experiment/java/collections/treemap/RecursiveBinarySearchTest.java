package io.github.farrukhjon.experiment.java.collections.treemap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.farrukhjon.experiment.java.collections.model.treemap.RecursiveBinarySearch;
import org.junit.jupiter.api.Test;

/**
 * Unit level test of binary search algorithm
 */
public class RecursiveBinarySearchTest {

    @Test
    public void testRecursiveBinarySearchAlgorithm() {
        RecursiveBinarySearch algorithm = new RecursiveBinarySearch();

        long[] sortedArray = {0, 11, 21, 31, 41, 51, 61, 71, 81, 91, 101};

        int result = algorithm.binarySearch(sortedArray, 81);

        assertEquals(8, result);
    }
}
