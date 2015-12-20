package com.rongpengli.leetcode.array;

public class FindPeakElement {
    public int findPeakElement1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }
        for (int i = 1; i <= nums.length - 2; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }
        int small = 0, large = nums.length;
        int middle = 0;
        while (small < large) {
            middle = small + (large - small) / 2;
            if (nums[middle] < (middle + 1 < nums.length ? nums[middle + 1] : Integer.MIN_VALUE)) {
                small = middle + 1;
            } else if (nums[middle] < (middle - 1 >= 0 ? nums[middle - 1] : Integer.MIN_VALUE)) {
                large = middle;
            } else {
                return middle;
            }
        }
        return large;
    }

    public static void main(String[] args) {
        FindPeakElement lFindPeakElement = new FindPeakElement();
        int[] nums = { 3, 4, 3, 2, 1 };
        System.out.println(lFindPeakElement.findPeakElement(nums));
    }
}
