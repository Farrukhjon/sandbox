package io.github.farrukhjon.experiment.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Created by Farrukhjon on 26-Sep-15.
 */
public class UtilityArraysTest {

    @Test
    public void testSortMethod() {
        //given:
        int[] someNumbers = {0, 1, 3, 8, 9, 4, 2, 7, 6, 5, 10};

        //when sort is called:
        Arrays.sort(someNumbers);

        //then we should expect such result:
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(expected, someNumbers);
    }
}
