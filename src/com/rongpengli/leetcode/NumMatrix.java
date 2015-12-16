package com.rongpengli.leetcode;

public class NumMatrix {
    int[][] matrix;

    public NumMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        this.matrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            this.matrix[i][0] = matrix[i][0];
            for (int j = 1; j < matrix[0].length; j++) {
                this.matrix[i][j] = this.matrix[i][j - 1] + matrix[i][j];
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                this.matrix[i][j] += this.matrix[i - 1][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (row1 == 0 && col1 == 0) {
            return matrix[row2][col2];
        }
        if (row1 == 0) {
            return matrix[row2][col2] - matrix[row2][col1 - 1];
        }
        if (col1 == 0) {
            return matrix[row2][col2] - matrix[row1 - 1][col2];
        }
        return matrix[row2][col2] - matrix[row1 - 1][col2] - matrix[row2][col1 - 1]
                + matrix[row1 - 1][col1 - 1];
    }

    public static void main(String[] args) {
        // int[][] matrix = { { 3, 0, 1, 4, 2 }, { 5, 6, 3, 2, 1 }, { 1, 2, 0,
        // 1, 5 },
        // { 4, 1, 0, 1, 7 }, { 1, 0, 3, 0, 5 } };
        // NumMatrix lNumMatrix = new NumMatrix(matrix);
        // System.out.println(lNumMatrix.sumRegion(2, 1, 4, 3));
        // System.out.println(lNumMatrix.sumRegion(1, 1, 2, 2));
        // System.out.println(lNumMatrix.sumRegion(1, 2, 2, 4));
        int[][] matrix = { { -4, -5 } };
        NumMatrix lNumMatrix = new NumMatrix(matrix);
        System.out.println(lNumMatrix.sumRegion(0, 0, 0, 0));
        System.out.println(lNumMatrix.sumRegion(0, 0, 0, 1));
        System.out.println(lNumMatrix.sumRegion(0, 1, 0, 1));
    }
}
