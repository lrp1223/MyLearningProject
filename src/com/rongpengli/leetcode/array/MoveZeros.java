package com.rongpengli.leetcode.array;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        for (; i + j < nums.length;) {
            if (nums[i + j] == 0) {
                j++;
            } else {
                nums[i] = nums[i + j];
                i++;
            }
        }
        for (; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeros lMoveZeros = new MoveZeros();
        int[] nums = { 0, 1, 0, 0, 3, 12 };
        lMoveZeros.moveZeroes(nums);
    }

}
