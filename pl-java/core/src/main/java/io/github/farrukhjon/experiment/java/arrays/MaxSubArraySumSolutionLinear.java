package io.github.farrukhjon.experiment.java.arrays;

public class MaxSubArraySumSolutionLinear implements MaxSubArraySum {

    /**
     * O(n^1 = n) - one loop solution.
     */
    @Override
    public int maxSumOfSubArray(int[] array) {
        int sumSubArray = 0;
        int maxSumSubArray = 0;
        for (int item : array) {
            sumSubArray = Math.max(item, sumSubArray + item);
            maxSumSubArray = Math.max(maxSumSubArray, sumSubArray);
        }
        return maxSumSubArray;
    }

}
