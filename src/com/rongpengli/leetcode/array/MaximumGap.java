package com.rongpengli.leetcode.array;

import java.util.Arrays;

public class MaximumGap {
    // Non-linear complexity
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i] - nums[i - 1]);
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumGap lMaximumGap = new MaximumGap();
        int[] nums = { 2, 19, 8, 4, 13 };
        System.out.println(lMaximumGap.maximumGap(nums));
    }

}
