package com.rongpengli.leetcode.array;

public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int min = nums[0], small = 0, large = nums.length - 1, mid;
        while (small < large) {
            if (nums[small] < nums[large]) {
                return nums[small];
            }
            mid = small + (large - small) / 2;
            if (nums[mid] >= nums[small]) {
                small = mid + 1;
            } else {
                large = mid;
            }
        }
        min = nums[small];
        return min;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 5, 7, 0, 1, 2 };
        FindMinimuminRotatedSortedArray lFindMinimuminRotatedSortedArray = new FindMinimuminRotatedSortedArray();
        System.out.println(lFindMinimuminRotatedSortedArray.findMin(nums));
    }

}
