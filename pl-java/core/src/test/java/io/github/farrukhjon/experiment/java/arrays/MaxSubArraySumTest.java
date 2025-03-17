package io.github.farrukhjon.experiment.java.arrays;

import io.github.farrukhjon.experiment.java.arrays.MaxSubArraySum;
import io.github.farrukhjon.experiment.java.arrays.MaxSubArraySumSolutionCubic;
import io.github.farrukhjon.experiment.java.arrays.MaxSubArraySumSolutionLinear;
import io.github.farrukhjon.experiment.java.arrays.MaxSubArraySumSolutionQuadratic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxSubArraySumTest {

    @Test
    public void testMaxSubArraySumSolutionCubic() {
        MaxSubArraySum solutionBigON3 = new MaxSubArraySumSolutionCubic();

        int[] ints = {0, 1, 2, 3, 5, -1, -5, 6, -4, -2};

        int maxSum = solutionBigON3.maxSumOfSubArray(ints);

        int expectedMaxSubArraySum = 11;
        assertEquals(expectedMaxSubArraySum, maxSum);
    }

    @Test
    public void testMaxSubArraySumSolutionQuadratic() {
        MaxSubArraySum solutionBigON2 = new MaxSubArraySumSolutionQuadratic();

        int[] ints = {0, 1, 2, 3, 5, -1, -5, 6, -4, -2};

        int maxSum = solutionBigON2.maxSumOfSubArray(ints);

        int expectedMaxSubArraySumMaxSubArraySum = 11;
        assertEquals(expectedMaxSubArraySumMaxSubArraySum, maxSum);
    }

    @Test
    public void testMaxSubArraySumSolutionLinear() {
        //given:
        MaxSubArraySum solutionBigON = new MaxSubArraySumSolutionLinear();
        int[] ints = {0, 1, 2, 3, 5, -1, -5, 6, -4, -2};

        //when:
        int maxSum = solutionBigON.maxSumOfSubArray(ints);

        //then:
        int expectedMaxSubArraySum = 11;
        assertEquals(expectedMaxSubArraySum, maxSum);

    }

}
