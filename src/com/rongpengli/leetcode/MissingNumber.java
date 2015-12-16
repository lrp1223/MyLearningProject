package com.rongpengli.leetcode;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        long total = nums.length * (nums.length + 1) / 2;
        for (int num : nums) {
            total -= num;
        }
        return (int) total;
    }

    public static void main(String[] args) {
        MissingNumber lMissingNumber = new MissingNumber();
        int[] nums = { 1 };
        System.out.println(lMissingNumber.missingNumber(nums));
    }

}
