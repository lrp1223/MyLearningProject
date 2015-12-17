package com.rongpengli.leetcode.array;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0) {
                total += prices[i] - prices[i - 1];
            }
        }
        return total;
    }

    public static void main(String[] args) {
        BuyAndSellStock lBuyAndSellStock = new BuyAndSellStock();
        int[] prices = { 1, 9, 6, 9, 1, 7, 1, 1, 5, 9, 9, 9 };
        System.out.println(lBuyAndSellStock.maxProfit(prices));
    }

}
