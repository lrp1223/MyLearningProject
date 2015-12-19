package com.rongpengli.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if (matrix != null && matrix.length > 0 && matrix[0].length > 0) {
            int height = matrix.length, width = matrix[0].length;
            int small = Math.min(height, width);
            for (int i = 0; i < small / 2; i++) {
                for (int j = i; j < width - i; j++) {
                    result.add(matrix[i][j]);
                }
                for (int j = i + 1; j < height - i; j++) {
                    result.add(matrix[j][width - 1 - i]);
                }
                for (int j = width - i - 2; j >= i; j--) {
                    result.add(matrix[height - 1 - i][j]);
                }
                for (int j = height - i - 2; j > i; j--) {
                    result.add(matrix[j][i]);
                }
            }
            if (small % 2 == 1) {
                if (small == width) {
                    for (int i = small / 2; i < height - small / 2; i++) {
                        result.add(matrix[i][small / 2]);
                    }
                } else {
                    for (int i = small / 2; i < width - small / 2; i++) {
                        result.add(matrix[small / 2][i]);
                    }
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        SpiralMatrix lSpiralMatrix = new SpiralMatrix();
        int[][] matrix = { { 1, 2, 3, 10 }, { 4, 5, 6, 11 }, { 7, 8, 9, 12 } };
        List<Integer> result = lSpiralMatrix.spiralOrder(matrix);
        for (Integer val : result) {
            System.out.println(val);
        }
    }

}
