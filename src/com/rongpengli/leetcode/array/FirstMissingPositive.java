package com.rongpengli.leetcode.array;

public class FirstMissingPositive {
    public int firstMissingPositive1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }
        int n = nums.length, i = 0, temp;
        while (i < n) {
            if (nums[i] == i + 1) {
                i++;
            } else if (nums[i] <= 0 || nums[i] > n || nums[nums[i] - 1] == nums[i]) {
                nums[i] = nums[--n];
            } else {
                temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        return n + 1;
    }

    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }
        int[] newNums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0 && nums[i] <= nums.length) {
                newNums[nums[i]] = 1;
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (newNums[i] == 0) {
                return i;
            }
        }
        return nums.length + 1;
    }

    public static void main(String[] args) {
        FirstMissingPositive lFirstMissingPositive = new FirstMissingPositive();
        int[] nums = { 1, 2, 0 };
        System.out.println(lFirstMissingPositive.firstMissingPositive(nums));

        int[] nums2 = { 3, 4, -1, 1 };
        System.out.println(lFirstMissingPositive.firstMissingPositive(nums2));

        int[] nums3 = { 1 };
        System.out.println(lFirstMissingPositive.firstMissingPositive(nums3));
    }

}
