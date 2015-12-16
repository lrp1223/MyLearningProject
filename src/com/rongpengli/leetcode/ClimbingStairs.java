package com.rongpengli.leetcode;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] lSteps = new int[n];
        lSteps[0] = 1;
        lSteps[1] = 2;
        for (int i = 2; i < n; i++) {
            lSteps[i] = lSteps[i - 1] + lSteps[i - 2];
        }
        return lSteps[n - 1];
    }

    // Failed because of time exceeded
    public int climStairs2(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climStairs2(n - 1) + climStairs2(n - 2);

    }

    public static void main(String[] args) {
        ClimbingStairs lClimbingStairs = new ClimbingStairs();
        int lStairs = 50;
        System.out.println(lClimbingStairs.climbStairs(lStairs));
        System.out.println(lClimbingStairs.climStairs2(lStairs));
    }

}
