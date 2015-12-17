package com.rongpengli.leetcode.array;

public class SortColors {
    // Straightforward
    public void sortColors1(int[] nums) {
        if (nums == null || nums.length == 1) {
            return;
        }
        int num0 = 0, num1 = 0;
        for (int i = 0; i < nums.length; i++) {
            switch (nums[i]) {
            case 0:
                num0++;
                break;
            case 1:
                num1++;
                break;
            }
        }
        for (int i = 0; i < num0; i++) {
            nums[i] = 0;
        }
        for (int i = num0; i < num0 + num1; i++) {
            nums[i] = 1;
        }
        for (int i = num0 + num1; i < nums.length; i++) {
            nums[i] = 2;
        }
    }

    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 1) {
            return;
        }
        int index0 = 0, index1 = 0, index2 = nums.length - 1;
        while (index1 <= index2) {
            if (nums[index1] == 0) {
                nums[index1] = nums[index0];
                nums[index0] = 0;
                index0++;
                index1++;
            } else if (nums[index1] == 2) {
                nums[index1] = nums[index2];
                nums[index2] = 2;
                index2--;
            } else {
                index1++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 0, 0, 2, 2, 1 };
        SortColors lSortColors = new SortColors();
        lSortColors.sortColors(nums);
        for (int val : nums) {
            System.out.print(val);
            System.out.print("\t");
        }
    }

}
