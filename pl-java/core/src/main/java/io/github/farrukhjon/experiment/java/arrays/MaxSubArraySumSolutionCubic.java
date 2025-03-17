package io.github.farrukhjon.experiment.java.arrays;

public class MaxSubArraySumSolutionCubic implements MaxSubArraySum {

    /**
     * O(n^3) - three nested loops.
     */
    @Override
    public int maxSumOfSubArray(int[] array) {
        int length = array.length;
        int maxSubArraySum = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                int sumSubArray = 0;
                for (int k = i; k <= j; k++) {
                    sumSubArray += array[k];
                }
                maxSubArraySum = Math.max(maxSubArraySum, sumSubArray);
            }
        }
        return maxSubArraySum;
    }

}
