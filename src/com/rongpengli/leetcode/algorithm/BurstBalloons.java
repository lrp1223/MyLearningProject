package com.rongpengli.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

public class BurstBalloons {
    public int maxCoins(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int value = 1, smallest, length, pos;
        List<Integer> numList = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            numList.add(nums[i]);
        }
        while (numList.size() > 2) {
            length = numList.size();
            smallest = numList.get(1);
            pos = 1;
            for (int i = 2; i < length - 1; i++) {
                if (numList.get(i) < smallest) {
                    smallest = numList.get(i);
                    pos = i;
                } else if (numList.get(i) == smallest) {

                }
            }
        }
        return value;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
