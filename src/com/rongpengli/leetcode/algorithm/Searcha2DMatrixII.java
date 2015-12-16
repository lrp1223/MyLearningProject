package com.rongpengli.leetcode.algorithm;

public class Searcha2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int rows = matrix.length, columns = matrix[0].length;
        int rowNumber = 0, columnNumber = columns - 1;
        while (rowNumber < rows && columnNumber >= 0) {
            if (matrix[rowNumber][columnNumber] == target) {
                return true;
            } else if (matrix[rowNumber][columnNumber] < target) {
                rowNumber++;
            } else {
                columnNumber--;
            }
        }
        return false;
    }

    public boolean searchMatrix1(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        return search(matrix, target, 0, 0, matrix.length - 1, matrix[0].length - 1);
    }

    private boolean search(int[][] matrix, int target, int startRow, int startCol, int endRow,
            int endCol) {
        if (startRow > endRow || startCol > endCol) {
            return false;
        } else {
            if (target == matrix[startRow][startCol]) {
                return true;
            } else if (target < matrix[startRow][startCol]) {
                return false;
            } else {
                boolean find = false;
                if (matrix[startRow][endCol] >= target) {
                    find = searchRow(matrix, target, startRow, startCol, endCol);
                }
                if (matrix[endRow][startCol] >= target) {
                    find = find || searchCol(matrix, target, startRow, endRow, startCol);
                }
                find = find || search(matrix, target, startRow + 1, startCol + 1, endRow, endCol);
                return find;
            }
        }
    }

    private boolean searchRow(int[][] matrix, int target, int row, int startCol, int endCol) {
        int mid = (startCol + endCol) / 2;
        if (startCol > endCol) {
            return false;
        } else if (target == matrix[row][mid]) {
            return true;
        } else if (target < matrix[row][mid]) {
            return searchRow(matrix, target, row, startCol, mid - 1);
        } else {
            return searchRow(matrix, target, row, mid + 1, endCol);
        }
    }

    private boolean searchCol(int[][] matrix, int target, int startRow, int endRow, int col) {
        int mid = (startRow + endRow) / 2;
        if (startRow > endRow) {
            return false;
        } else if (target == matrix[mid][col]) {
            return true;
        } else if (target < matrix[mid][col]) {
            return searchCol(matrix, target, startRow, mid - 1, col);
        } else {
            return searchCol(matrix, target, mid + 1, endRow, col);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 },
                { 10, 13, 14, 17, 24 }, { 18, 21, 23, 26, 30 } };
        int target = 16;

        Searcha2DMatrixII lSearcha2dMatrixII = new Searcha2DMatrixII();
        System.out.println(lSearcha2dMatrixII.searchMatrix(matrix, target));
    }

}
