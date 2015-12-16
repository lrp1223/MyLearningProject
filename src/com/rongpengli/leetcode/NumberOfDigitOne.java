package com.rongpengli.leetcode;

public class NumberOfDigitOne {
    public int countDigitOne(int n) {
        long lNum = n;
        int bit = 1;
        while (true) {
            if (lNum > 10) {
                bit++;
                lNum = lNum / 10;
            } else {
                break;
            }
        }
        int lCount = 0;
        for (int i = bit; i > 0; i--) {
            if (lNum / Math.pow(10.0, i) > 2) {
                // lCount +=
            }
        }
        for (long i = 1; i <= lNum; i++) {
            long lCurr = i;
            while (lCurr > 0) {
                if (((lCurr % 10) ^ 1) == 0) {
                    lCount++;
                }
                lCurr /= 10;
            }
        }
        return lCount;
    }

    public static void main(String[] args) {
        NumberOfDigitOne lNumberOfDigitOne = new NumberOfDigitOne();
        System.out.println(lNumberOfDigitOne.countDigitOne(824883294));
    }

}
