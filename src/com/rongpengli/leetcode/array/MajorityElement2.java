package com.rongpengli.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (nums.length == 0) {
            return res;
        }

        int count[] = new int[2];
        Integer x[] = new Integer[2];

        x[0] = 0;
        x[1] = 1;
        for (int i = 0; i < nums.length; i++) {
            if (x[0] == nums[i]) {
                count[0]++;
            } else if (x[1] == nums[i]) {
                count[1]++;
            } else if (count[0] == 0) {
                x[0] = nums[i];
                count[0] = 1;
            } else if (count[1] == 0) {
                x[1] = nums[i];
                count[1] = 1;
            } else {
                count[0]--;
                count[1]--;
            }
        }

        Arrays.fill(count, 0);
        for (int i : nums) {
            if (i == x[0]) {
                count[0]++;
            } else if (i == x[1]) {
                count[1]++;
            }
        }
        for (int j = 0; j < 2; j++) {
            if (count[j] > nums.length / 3 && !res.contains(x[j])) {
                res.add(x[j]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        MajorityElement2 lMajorityElement2 = new MajorityElement2();
        int[] nums = { 2, 2, 2, -5, 2, 3, 0, 0, 0, 0 };
        List<Integer> result = lMajorityElement2.majorityElement(nums);
        for (Integer ll : result) {
            System.out.println(ll);
        }
    }

}
