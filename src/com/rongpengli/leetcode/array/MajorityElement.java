package com.rongpengli.leetcode.array;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int value = nums[0], times = 0;
        for (int i = 0; i < nums.length; i++) {
            if (times == 0) {
                value = nums[i];
                times++;
            } else {
                if (nums[i] == value) {
                    times++;
                } else {
                    times--;
                }
            }
        }
        return value;
    }

    public static void main(String[] args) {
        MajorityElement lMajorityElement = new MajorityElement();
        int[] nums = { 2, 2, 2, 3, 3 };
        System.out.println(lMajorityElement.majorityElement(nums));
    }

}
