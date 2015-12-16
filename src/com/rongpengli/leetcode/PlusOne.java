package com.rongpengli.leetcode;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1, val;
        for (int i = digits.length - 1; i >= 0; i--) {
            val = carry + digits[i];
            digits[i] = val % 10;
            carry = val / 10;
        }
        if (carry == 0 || digits.length == 0) {
            return digits;
        } else {
            int[] lNew = new int[digits.length + 1];
            lNew[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                lNew[i + 1] = digits[i];
            }
            return lNew;
        }
    }

    public int[] plusOne_better(int[] digits) {
        int n = digits.length - 1;
        while (n >= 0) {
            if (digits[n] + 1 < 10) {
                digits[n] += 1;
                return digits;
            }
            digits[n] = 0;
            n--;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        PlusOne lPlusOne = new PlusOne();
        int[] digits = { 9, 9, 9 };
        int[] newD = lPlusOne.plusOne(digits);
        for (int i = 0; i < newD.length; i++) {
            System.out.println(newD[i]);
        }

        int[] digits1 = { 9, 6, 9 };
        int[] newDD = lPlusOne.plusOne_better(digits1);
        for (int i = 0; i < newDD.length; i++) {
            System.out.println(newDD[i]);
        }
    }

}
