package com.rongpengli.leetcode;

public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        if (n <= 0) {
            return 0;
        }
        int result = 0;
        while (n > 0) {
            result += n / 5;
            n = n / 5;
        }
        return result;
    }

    public static void main(String[] args) {
        FactorialTrailingZeroes lFactorialTrailingZeroes = new FactorialTrailingZeroes();
        System.out.println(lFactorialTrailingZeroes.trailingZeroes(1808548329));
    }

}
