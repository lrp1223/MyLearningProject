package com.rongpengli.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> lResult = new ArrayList<Integer>();
        int[] lNums = new int[rowIndex + 1];
        lNums[0] = 1;
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = rowIndex; j > 0; j--) {
                lNums[j] = lNums[j] + lNums[j - 1];
            }
        }
        for (int i = 0; i < lNums.length; i++) {
            lResult.add(lNums[i]);
        }

        return lResult;
    }

    public static void main(String[] args) {
        PascalsTriangle lPascalsTriangle = new PascalsTriangle();
        System.out.println(lPascalsTriangle.getRow(3));
    }
}
