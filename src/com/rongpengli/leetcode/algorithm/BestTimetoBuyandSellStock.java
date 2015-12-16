package com.rongpengli.leetcode.algorithm;

public class BestTimetoBuyandSellStock {
    // Time limited
    public int maxProfit1(int[] prices) {
        int max = 0;
        if (prices == null || prices.length == 0) {
            return 0;
        }
        for (int i = prices.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (prices[i] - prices[j] > max) {
                    max = prices[i] - prices[j];
                }
            }
        }
        return max;
    }

    public int maxProfit2(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int max = prices[prices.length - 1], value = 0;
        for (int i = prices.length - 2; i >= 0; i--) {
            if (prices[i] >= max) {
                max = prices[i];
                continue;
            }
            for (int j = i; j >= 0; j--) {
                if (max - prices[j] > value) {
                    value = max - prices[j];
                }
            }
        }
        return value;
    }

    public int maxProfit3(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int min = prices[0], value = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= min) {
                min = prices[i];
                continue;
            }
            for (int j = i; j < prices.length; j++) {
                if (prices[j] - min > value) {
                    value = prices[j] - min;
                }
            }
        }
        return value;
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int min = Integer.MAX_VALUE, value = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            value = Math.max(value, prices[i] - min);
        }
        return value;
    }

    public static void main(String[] args) {
        BestTimetoBuyandSellStock lBestTimetoBuyandSellStock = new BestTimetoBuyandSellStock();

        // int[] prices = { 3, 5, 10, 1, 2, 14, 1, 10 };
        int[] prices = { 1, 2 };
        System.out.println(lBestTimetoBuyandSellStock.maxProfit(prices));
    }

}
