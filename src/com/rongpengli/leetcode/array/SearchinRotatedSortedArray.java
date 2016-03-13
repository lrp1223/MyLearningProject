package com.rongpengli.leetcode.array;

public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int small = 0, large = nums.length - 1, mid;
        while (small <= large) {
            mid = small + (large - small) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid] && (nums[small] > nums[mid] || target >= nums[small])
                    || target > nums[mid] && target > nums[large] && nums[mid] < nums[large]) {
                large = mid - 1;
            } else {
                small = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchinRotatedSortedArray lSearchinRotatedSortedArray = new SearchinRotatedSortedArray();
        // int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        // System.out.println(lSearchinRotatedSortedArray.search(nums, 4));
        // System.out.println(lSearchinRotatedSortedArray.search(nums, 5));
        // System.out.println(lSearchinRotatedSortedArray.search(nums, 6));
        // System.out.println(lSearchinRotatedSortedArray.search(nums, 7));
        // System.out.println(lSearchinRotatedSortedArray.search(nums, 0));
        // System.out.println(lSearchinRotatedSortedArray.search(nums, 1));
        // System.out.println(lSearchinRotatedSortedArray.search(nums, 2));
        //
        // int[] nums1 = { 5, 1, 2, 3, 4 };
        // System.out.println(lSearchinRotatedSortedArray.search(nums1, 1));
        //
        // int[] nums2 = { 5, 1, 3 };
        // System.out.println(lSearchinRotatedSortedArray.search(nums2, 5));
        int[] nums = { 4, 5, 6, 7, 8, 1, 2, 3 };
        System.out.println(lSearchinRotatedSortedArray.search(nums, 8));
    }

}
