package com.rongpengli.leetcode;

public class SingleNum {
    public int[] singleNumber3(int[] nums) {
        int[] result = { 0, 0 };
        for (int i = 0; i < 32; i++) {
            int count1 = 0;
            result[0] = 0;
            result[1] = 0;
            for (int j = 0; j < nums.length; j++) {
                if (((nums[j] >>> i) & 1) == 1) {
                    result[0] = result[0] ^ nums[j];
                    count1++;
                } else {
                    result[1] = result[1] ^ nums[j];
                }
            }
            if (count1 % 2 == 1) {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNum lSingleNum = new SingleNum();

        int[] nums = { -1139700704, -1653765433 };
        int[] lResult = lSingleNum.singleNumber3(nums);
        System.out.println(lResult[0] + "," + lResult[1]);

    }

}
