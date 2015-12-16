package com.rongpengli.leetcode;

public class MedianOfTwoArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if ((nums1.length + nums2.length) % 2 == 1) {
            return findlNum(nums1, nums2, (nums1.length + nums2.length) / 2);
        } else {
            return (findlNum(nums1, nums2, (nums1.length + nums2.length) / 2) + findlNum(nums1,
                    nums2, (nums1.length + nums2.length) / 2 - 1)) / 2;
        }
    }

    private double findlNum(int[] nums1, int[] nums2, int l) {
        int i = 0, j = 0;
        double result = 0.0;

        for (int k = 0; k <= l; k++) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    result = nums1[i++];
                } else {
                    result = nums2[j++];
                }
            } else if (i == nums1.length) {
                result = nums2[j++];
            } else {
                result = nums1[i++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MedianOfTwoArray lMedianOfTwoArray = new MedianOfTwoArray();
        int[] num1 = { 1, 2, 3 };
        int[] num2 = { 4, 5 };
        System.out.println(lMedianOfTwoArray.findMedianSortedArrays(num1, num2));
    }
}
