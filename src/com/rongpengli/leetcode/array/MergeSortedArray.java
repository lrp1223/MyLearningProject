package com.rongpengli.leetcode.array;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int i = m + n - 1, j = m - 1, k = n - 1;
        for (; i >= 0 && j >= 0 && k >= 0; i--) {
            if (nums1[j] >= nums2[k]) {
                nums1[i] = nums1[j];
                j--;
            } else {
                nums1[i] = nums2[k];
                k--;
            }
        }
        if (k >= 0) {
            while (k >= 0) {
                nums1[k] = nums2[k];
                k--;
            }
        }
    }

    public static void main(String[] args) {
        MergeSortedArray lMergeSortedArray = new MergeSortedArray();
        int[] nums1 = { 2, 3, 5, 7, 10, 0, 0, 0, 0 };
        int[] nums2 = { 1, 1, 1, 2 };
        lMergeSortedArray.merge(nums1, 5, nums2, 4);
        for (int i = 0; i < 9; i++) {
            System.out.println(nums1[i]);
        }
    }

}
