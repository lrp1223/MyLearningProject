package com.rongpengli.leetcode.sort;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        String[] newStr = new String[nums.length];
        StringBuilder lStringBuilder = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            newStr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(newStr, new NewCompare());
        if (newStr[0].equals("0")) {
            return "0";
        }
        for (String str : newStr) {
            lStringBuilder.append(str);
        }
        return lStringBuilder.toString();
    }

    public static void main(String[] args) {
        LargestNumber lLargestNumber = new LargestNumber();
        int[] nums = { 2, 65, 7, 3, 8, 871 };
        System.out.println(lLargestNumber.largestNumber(nums));
        int[] nums1 = { 0, 0 };
        System.out.println(lLargestNumber.largestNumber(nums1));
    }

}

class NewCompare implements Comparator<String> {
    @Override
    public final int compare(String str1, String str2) {
        String front = str1 + str2;
        String end = str2 + str1;
        return front.compareTo(end) * (-1);
    }
}
