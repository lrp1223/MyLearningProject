package com.rongpengli.leetcode.bit;

public class PowerofTwo {
    public boolean isPowerOfTwo(int n) {
        long x = n;
        if (x <= 0) {
            return false;
        }
        int bitNum = 0;
        for (int i = 0; i < 64; i++) {
            if (((x >>> i) & 1) == 1) {
                bitNum++;
                if (bitNum > 1) {
                    return false;
                }
            }
        }
        return bitNum <= 1;
    }

    public static void main(String[] args) {
        PowerofTwo lPowerofTwo = new PowerofTwo();
        System.out.println(lPowerofTwo.isPowerOfTwo(4));
        System.out.println(lPowerofTwo.isPowerOfTwo(0));
        System.out.println(lPowerofTwo.isPowerOfTwo(6));
    }

}
