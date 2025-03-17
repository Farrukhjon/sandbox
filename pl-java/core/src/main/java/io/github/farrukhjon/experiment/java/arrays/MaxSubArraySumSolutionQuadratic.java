package io.github.farrukhjon.experiment.java.arrays;

public class MaxSubArraySumSolutionQuadratic implements MaxSubArraySum {

    /**
     * O(n^2) by two nested loops.
     */
    @Override
    public int maxSumOfSubArray(int[] array) {
        int length = array.length;
        int maxSubArraySum = 0;
        for (int i = 0; i < length; i++) {
            int sumSubArray = 0;
            for (int j = i; j < length; j++) {
                sumSubArray += array[j];
                maxSubArraySum = Math.max(maxSubArraySum, sumSubArray);
            }
        }
        return maxSubArraySum;

    }
}
