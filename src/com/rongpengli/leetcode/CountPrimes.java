package com.rongpengli.leetcode;

public class CountPrimes {
    public int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }
        int[] lNums = new int[n];
        lNums[0] = lNums[1] = 1;
        for (int i = 2; i <= n / 2; i++) {
            for (int j = 2; j <= n / 2; j++) {
                if (i * j >= n) {
                    break;
                }
                lNums[i * j] = 1;
            }
        }
        int num = 0;
        for (int i = 0; i < n; i++) {
            if (lNums[i] == 0) {
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        CountPrimes lCountPrimes = new CountPrimes();
        System.out.println(lCountPrimes.countPrimes(20));
    }

}
