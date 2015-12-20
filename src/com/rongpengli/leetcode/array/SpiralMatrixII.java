package com.rongpengli.leetcode.array;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        if (n < 0) {
            return null;
        }
        if (n == 0) {
            return new int[0][0];
        }
        int[][] matrix = new int[n][n];
        int val = 1;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i; j++) {
                matrix[i][j] = val++;
            }
            for (int j = i + 1; j < n - i; j++) {
                matrix[j][n - i - 1] = val++;
            }
            for (int j = n - i - 2; j >= i; j--) {
                matrix[n - i - 1][j] = val++;
            }
            for (int j = n - i - 2; j > i; j--) {
                matrix[j][i] = val++;
            }
        }
        if (n % 2 == 1) {
            matrix[n / 2][n / 2] = val;
        }
        return matrix;
    }

    public static void main(String[] args) {
        SpiralMatrixII lSpiralMatrixII = new SpiralMatrixII();
        int[][] matrix = lSpiralMatrixII.generateMatrix(4);
        for (int[] val : matrix) {
            for (int ll : val) {
                System.out.print(ll);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
