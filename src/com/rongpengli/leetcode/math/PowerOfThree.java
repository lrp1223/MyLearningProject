package com.rongpengli.leetcode.math;

public class PowerOfThree {
    // Loop
    public boolean isPowerOfThree1(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1) {
            if (n % 3 != 0) {
                return false;
            }
            n = n / 3;
        }
        return true;
    }

    public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19, 3^20 is bigger than int
        return (n > 0 && 1162261467 % n == 0);
    }

    public static void main(String[] args) {
        PowerOfThree lPowerOfThree = new PowerOfThree();
        System.out.println(lPowerOfThree.isPowerOfThree(3));
        System.out.println(lPowerOfThree.isPowerOfThree(9));
        System.out.println(lPowerOfThree.isPowerOfThree(1));
        System.out.println(lPowerOfThree.isPowerOfThree(6));
    }

}
