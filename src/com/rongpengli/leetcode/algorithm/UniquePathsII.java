package com.rongpengli.leetcode.algorithm;

public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 0) {
            obstacleGrid[0][0] = 1;
        } else if (obstacleGrid[0][0] == 1) {
            obstacleGrid[0][0] = 0;
        }
        for (int i = 1; i < obstacleGrid.length; i++) {
            if (obstacleGrid[i - 1][0] == 0 || obstacleGrid[i][0] == 1) {
                obstacleGrid[i][0] = 0;
            } else {
                obstacleGrid[i][0] = 1;
            }
        }
        for (int i = 1; i < obstacleGrid[0].length; i++) {
            if (obstacleGrid[0][i - 1] == 0 || obstacleGrid[0][i] == 1) {
                obstacleGrid[0][i] = 0;
            } else {
                obstacleGrid[0][i] = 1;
            }
        }
        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                } else {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                }
            }
        }

        return obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }

    public static void main(String[] args) {
        UniquePathsII lUniquePathsII = new UniquePathsII();
        int[][] obs = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
        System.out.println(lUniquePathsII.uniquePathsWithObstacles(obs));
    }
}
