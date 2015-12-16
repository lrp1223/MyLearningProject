package com.rongpengli.leetcode.algorithm;

import java.util.Arrays;

//Divide and conquer
public class KthLargestElementinanArray {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        int[] nums = { -2, 70, 65, 92, 0, 10 };

        KthLargestElementinanArray lKthLargestElementinanArray = new KthLargestElementinanArray();
        System.out.println(lKthLargestElementinanArray.findKthLargest(nums, 2));
    }

}
