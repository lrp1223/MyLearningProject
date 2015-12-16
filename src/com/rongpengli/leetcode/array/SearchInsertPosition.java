package com.rongpengli.leetcode.array;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] >= target) {
                return 0;
            }
            if (nums[0] < target) {
                return 1;
            }
        }
        int small = 0, large = nums.length - 1, mid;
        while (small <= large) {
            mid = small + (large - small) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                if (mid - 1 >= 0 && nums[mid - 1] < target) {
                    return mid;
                }
                large = mid - 1;
            } else {
                if (mid + 1 < nums.length && nums[mid + 1] > target) {
                    return mid + 1;
                }
                small = mid + 1;
            }
        }
        if (large <= 0) {
            return 0;
        } else {
            return nums.length;
        }
    }

    public static void main(String[] args) {
        SearchInsertPosition lSearchInsertPosition = new SearchInsertPosition();
        // int[] nums = { 1, 3, 5, 6 };
        // System.out.println(lSearchInsertPosition.searchInsert(nums, 5));
        // System.out.println(lSearchInsertPosition.searchInsert(nums, 2));
        // System.out.println(lSearchInsertPosition.searchInsert(nums, 7));
        // System.out.println(lSearchInsertPosition.searchInsert(nums, 0));
        int[] nums = { 1, 3 };
        System.out.println(lSearchInsertPosition.searchInsert(nums, 3));
    }

}
