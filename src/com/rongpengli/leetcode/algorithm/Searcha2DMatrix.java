package com.rongpengli.leetcode.algorithm;

public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
        while (i <= matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public boolean searchMatrix1(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        return searchMatrixHelper(matrix, target, 0, 0, matrix.length - 1, matrix[0].length - 1);
    }

    private boolean searchMatrixHelper(int[][] matrix, int target, int startRow, int startColumn,
            int endRow, int endColumn) {
        if (startRow > endRow) {
            return false;
        } else if (startRow == endRow) {
            if (endColumn <= startColumn && target != matrix[startRow][startColumn]) {
                return false;
            }
            int mid = (startColumn + endColumn) / 2;
            if (target == matrix[startRow][mid]) {
                return true;
            } else if (target < matrix[startRow][mid]) {
                return searchMatrixHelper(matrix, target, startRow, startColumn, startRow, mid - 1);
            } else {
                return searchMatrixHelper(matrix, target, startRow, mid + 1, startRow, endColumn);
            }
        } else {
            int mid = (startRow + endRow) / 2;
            if (target == matrix[mid][0] || target == matrix[mid][endColumn]) {
                return true;
            } else if (target < matrix[mid][0]) {
                return searchMatrixHelper(matrix, target, startRow, startColumn, mid - 1, endColumn);
            } else if (target < matrix[mid][endColumn]) {
                return searchMatrixHelper(matrix, target, mid, startColumn, mid, endColumn);
            } else {
                return searchMatrixHelper(matrix, target, mid + 1, startColumn, endRow, endColumn);
            }
        }
    }

    public static void main(String[] args) {
        // int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34,
        // 50 } };
        // int target = 3;

        // int[][] matrix = { { 1 }, { 3 } };
        // int target = 2;
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };
        int target = 20;

        Searcha2DMatrix lSearcha2dMatrix = new Searcha2DMatrix();
        System.out.println(lSearcha2dMatrix.searchMatrix(matrix, target));
    }

}
