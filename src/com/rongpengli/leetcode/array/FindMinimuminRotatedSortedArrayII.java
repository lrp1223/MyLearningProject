package com.rongpengli.leetcode.array;

public class FindMinimuminRotatedSortedArrayII {
    public int findMin1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                break;
            }
        }
        return min;
    }

    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int small = 0, large = nums.length - 1, mid;
        while (small < large) {
            if (nums[small] < nums[large]) {
                return nums[small];
            }
            mid = small + (large - small) / 2;
            if (nums[mid] > nums[small]) {
                small = mid + 1;
            } else if (nums[mid] < nums[small]) {
                large = mid;
            } else {
                small++;
            }
        }
        return nums[small];
    }

    public static void main(String[] args) {
        // int[] nums = { 2, 3, 4, 5, 5, 6, 7, 7, 0, 1, 2 };
        int[] nums = { 10, 1, 10, 10, 10 };
        FindMinimuminRotatedSortedArrayII lFindMinimuminRotatedSortedArray = new FindMinimuminRotatedSortedArrayII();
        System.out.println(lFindMinimuminRotatedSortedArray.findMin(nums));
    }

}
