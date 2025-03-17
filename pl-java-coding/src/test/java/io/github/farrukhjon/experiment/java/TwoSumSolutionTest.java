package io.github.farrukhjon.experiment.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumSolutionTest {

    TwoSum twoSumSolution;

    @Test
    public void testTwoSumSolutionBrutForce() {
        twoSumSolution = new TwoSumSolutionBrutForce();

        // given:
        int[] nums = new int[] { 2, 7, 11, 15 };
        // when:
        int[] result = twoSumSolution.twoSum(nums, 9);
        // then:
        Assertions.assertArrayEquals(new int[] { 0, 1 }, result);

        // given:
        nums = new int[] { 3, 3 };
        // when:
        result = twoSumSolution.twoSum(nums, 6);
        // then:
        Assertions.assertArrayEquals(new int[] { 0, 1 }, result);

        // given:
        nums = new int[] { 1, 2, 3 };
        // when:
        result = twoSumSolution.twoSum(nums, 4);
        // then:
        Assertions.assertArrayEquals(new int[] { 0, 2 }, result);
    }

    @Test
    public void testTwoSumSolutionLinier() {
        twoSumSolution = new TwoSumSolutionLinier();

        // given:
        int[] nums = new int[] { 2, 7, 11, 15 };
        // when:
        int[] result = twoSumSolution.twoSum(nums, 9);
        // then:
        Assertions.assertArrayEquals(new int[] { 0, 1 }, result);

        // given:
        nums = new int[] { 3, 3 };
        // when:
        result = twoSumSolution.twoSum(nums, 6);
        // then:
        Assertions.assertArrayEquals(new int[] { 0, 1 }, result);

        // given:
        nums = new int[] { 1, 2, 3 };
        // when:
        result = twoSumSolution.twoSum(nums, 4);
        // then:
        Assertions.assertArrayEquals(new int[] { 0, 2 }, result);
    }

}
