package com.rongpengli.leetcode;

public class MyPow {
    public double myPow(double x, int n) {
        boolean flag = false;
        if (n < 0) {
            flag = true;
            n *= -1;
        }
        double result = 1.0;
        while (n > 0) {
            if (n % 2 == 1) {
                result *= x;
            }
            x *= x;
            n /= 2;
        }
        if (flag) {
            result = 1 / result;
        }
        return result;
    }

    public static void main(String[] args) {
        MyPow lMyPow = new MyPow();
        System.out.println(lMyPow.myPow(2, 10));
        System.out.println(lMyPow.myPow(2, -3));
    }

}
