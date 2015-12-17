package com.rongpengli.leetcode.array;

import java.util.PriorityQueue;

public class UglyNumber2 {
    public int nthUglyNumber1(int n) {
        if (n <= 0) {
            return 0;
        }
        PriorityQueue<Long> lPriorityQueue = new PriorityQueue<Long>();
        lPriorityQueue.add(1l);

        long temp = 1;
        for (int i = 0; i < n; i++) {
            temp = lPriorityQueue.poll();
            while (!lPriorityQueue.isEmpty() && temp == lPriorityQueue.peek()) {
                temp = lPriorityQueue.poll();
            }
            lPriorityQueue.add(temp * 2);
            lPriorityQueue.add(temp * 3);
            lPriorityQueue.add(temp * 5);
        }
        return (int) temp;
    }

    public int nthUglyNumber(int n) {
        if (n <= 0) {
            return 0;
        }
        int[] ugly = new int[n];
        ugly[0] = 1;

        int ix2 = 0, ix3 = 0, ix5 = 0;
        for (int i = 1; i < n; i++) {
            ugly[i] = getMin(ugly[ix2] * 2l, ugly[ix3] * 3l, ugly[ix5] * 5l);
            if (ugly[i] == ugly[ix2] * 2l) {
                ix2++;
            }
            if (ugly[i] == ugly[ix3] * 3l) {
                ix3++;
            }
            if (ugly[i] == ugly[ix5] * 5l) {
                ix5++;
            }
        }
        return ugly[n - 1];
    }

    public int getMin(long x1, long x2, long x3) {
        long smallest = Math.min(x1, x2);
        smallest = Math.min(smallest, x3);
        return (int) smallest;
    }

    public static void main(String[] args) {
        UglyNumber2 uglyNumber2 = new UglyNumber2();
        System.out.println(uglyNumber2.nthUglyNumber(1407));
    }
}
