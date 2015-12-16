package com.rongpengli.leetcode;

public class UniqueBinarySearchTrees {
    // bad one
    public int numTrees1(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] result = new int[n];
        result[0] = 1;
        result[1] = 2;
        for (int i = 2; i < n; i++) {
            result[i] += 2 * result[i - 1];
            for (int j = i; j > i / 2 + 1; j--) {
                result[i] += 2 * result[i - j] * result[j - 2];
            }
            if (i % 2 == 0) {
                result[i] += result[i / 2 - 1] * result[i / 2 - 1];
            }
            System.out.println(result[i]);
        }
        return result[n - 1];
    }

    public int numTrees(int n) {
        int[] result = new int[n + 1];
        result[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result[i] += result[i - j] * result[j - 1];
            }
            System.out.println(result[i]);
        }
        return result[n];
    }

    public static void main(String[] args) {
        UniqueBinarySearchTrees lUniqueBinarySearchTrees = new UniqueBinarySearchTrees();
        System.out.println(lUniqueBinarySearchTrees.numTrees(20));
    }

}
