package com.rongpengli.leetcode;

public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int[] lNum1 = new int[32];
        int[] lNum2 = new int[32];
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < nums.length; j++) {
                lNum1[i] += (nums[j] >>> i) & 1;
            }
            for (int j = 1; j < nums.length; j++) {
                lNum2[i] += (j >>> i) & 1;
            }
        }
        int num = 0;
        for (int i = 0; i < 32; i++) {
            if (lNum1[i] > lNum2[i]) {
                num += Math.pow(2, i);
            }
        }
        return num;
    }

    public int findDuplicate2(int[] nums) {
        int low = 1, high = nums.length - 1;
        while (low <= high) {
            int mid = (int) (low + (high - low) * 0.5);
            int cnt = 0;
            for (int a : nums) {
                if (a <= mid) {
                    ++cnt;
                }
            }
            if (cnt <= mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        FindDuplicateNumber lFindDuplicateNumber = new FindDuplicateNumber();
        int[] nums = { 1, 2, 3, 5, 5, 5, 6 };
        System.out.println(lFindDuplicateNumber.findDuplicate(nums));

        int[] nums1 = { 1, 5, 5, 5, 2, 3, 6 };
        System.out.println(lFindDuplicateNumber.findDuplicate2(nums1));
    }

}
