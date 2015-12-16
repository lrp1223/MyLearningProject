package com.rongpengli.leetcode;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (divisor == 0 || dividend == 0) {
            return 0;
        }
        int minus = 0;
        long num1 = dividend, num2 = divisor;
        if (num1 < 0) {
            num1 = Math.abs(num1);
            minus++;
        }
        if (divisor < 0) {
            num2 = Math.abs(num2);
            minus++;
        }
        int result = 0;
        while (num1 > 0) {
            if (num1 < num2) {
                break;
            }
            num1 = num1 - num2;
            result++;
        }
        if (minus == 1) {
            result = -1 * result;
        }
        return result;
    }

    public static void main(String[] args) {
        DivideTwoIntegers lDivideTwoIntegers = new DivideTwoIntegers();
        System.out.println(lDivideTwoIntegers.divide(1, 2));
    }

}
