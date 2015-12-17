package com.rongpengli.leetcode.array;

public class RotateImage {
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length
                || matrix.length == 1) {
            return;
        }
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        RotateImage lRotateImage = new RotateImage();
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        lRotateImage.rotate(matrix);
        for (int[] element : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(element[j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

}
