package io.github.farrukhjon.experiment.java;

import java.util.HashMap;

public class TwoSumSolutionLinier implements TwoSum {

    @Override
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[0];

        var valToIdx = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (valToIdx.containsKey(diff)) {
                result = new int[] { valToIdx.get(diff), i };
                return result;
            } else {
                valToIdx.put(nums[i], i);
            }
        }
        return result;
    }

}
