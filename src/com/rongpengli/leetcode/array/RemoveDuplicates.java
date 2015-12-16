package com.rongpengli.leetcode.array;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int length = nums.length;
        int start = 0;
        for (int i = 1; i < length; i++) {
            if (nums[i] != nums[start]) {
                start++;
                nums[start] = nums[i];
            }
        }
        return start + 1;
    }

    public int removeDuplicates2(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int length = nums.length;
        int start = 0, times = 1;
        for (int i = 1; i < length; i++) {
            if (nums[i] != nums[start]) {
                start++;
                if (times > 1) {
                    nums[start] = nums[start - 1];
                    start++;
                }
                nums[start] = nums[i];
                times = 1;
            } else {
                times++;
            }
        }
        if (times > 1) {
            start++;
            nums[start] = nums[start - 1];
        }
        return start + 1;
    }

    public int removeDuplicates22(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int length = nums.length;
        int start = 0, times = 1;
        for (int i = 1; i < length; i++) {
            if (nums[i] != nums[start]) {
                start++;
                nums[start] = nums[i];
                times = 1;
            } else {
                times++;
                if (times == 2) {
                    start++;
                    nums[start] = nums[start - 1];
                }
            }
        }
        return start + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicates lRemoveDuplicates = new RemoveDuplicates();
        int[] nums = { 1, 1, 1, 1, 2, 2, 2, 3 };
        int length = lRemoveDuplicates.removeDuplicates22(nums);
        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }

}
