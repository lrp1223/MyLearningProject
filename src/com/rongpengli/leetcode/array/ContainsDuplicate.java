package com.rongpengli.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate1(int[] nums) {
        boolean contains = false;
        Map<Integer, Integer> lMap = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (lMap.get(num) != null) {
                contains = true;
                break;
            } else {
                lMap.put(num, 1);
            }
        }
        return contains;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> lMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (lMap.get(nums[i]) == null) {
                lMap.put(nums[i], i);
            } else {
                if (i - lMap.get(nums[i]) <= k) {
                    return true;
                } else {
                    lMap.put(nums[i], i);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate lContainsDuplicate = new ContainsDuplicate();
        int[] nums = { 1, 0, 1, 1 };
        System.out.println(lContainsDuplicate.containsDuplicate1(nums));

        System.out.println(lContainsDuplicate.containsNearbyDuplicate(nums, 1));

    }

}
