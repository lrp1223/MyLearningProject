package com.rongpengli.leetcode.algorithm;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int current = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (current < 0) {
                if (nums[i] > current) {
                    current = nums[i];
                }
            } else {
                current += nums[i];
            }

            if (current > max) {
                max = current;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumSubarray lMaximumSubarray = new MaximumSubarray();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(lMaximumSubarray.maxSubArray(nums));

        int[] nums2 = { -5, -1, -4, -3 };
        System.out.println(lMaximumSubarray.maxSubArray(nums2));
    }
}
