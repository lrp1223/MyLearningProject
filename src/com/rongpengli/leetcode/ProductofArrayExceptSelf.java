package com.rongpengli.leetcode;

public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int rest = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            result[j] = result[j] * rest;
            rest *= nums[j];
        }
        return result;
    }

    public static void main(String[] args) {
        ProductofArrayExceptSelf lProductofArrayExceptSelf = new ProductofArrayExceptSelf();
        int[] nums = { 2, 3, 4, 6, 7 };
        nums = lProductofArrayExceptSelf.productExceptSelf(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

}
