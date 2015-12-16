package com.rongpengli.leetcode.algorithm;

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int f[] = new int[nums.length];
        int g[] = new int[nums.length];
        f[0] = g[1] = nums[0];
        f[1] = nums[1];
        for (int i = 2; i < nums.length; i++) {
            f[i] = Math.max(f[i - 2], g[i - 1]) + nums[i];
            g[i] = Math.max(f[i - 1], g[i - 1]);
        }
        return Math.max(f[nums.length - 1], g[nums.length - 1]);
    }

    public int rob2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int beforePrevious = nums[0], previous = nums[1];
        for (int i = 2; i < nums.length; i++) {
            if (previous > beforePrevious + nums[i]) {
                beforePrevious = previous;
            } else {
                int temp = beforePrevious;
                beforePrevious = previous;
                previous = temp + nums[i];
            }
        }
        return Math.max(previous, beforePrevious);
    }

    public static void main(String[] args) {
        HouseRobber lHouseRobber = new HouseRobber();

        int[] nums = { 2, 56, 34, 65, 98 };
        System.out.println(lHouseRobber.rob2(nums));

    }

}
