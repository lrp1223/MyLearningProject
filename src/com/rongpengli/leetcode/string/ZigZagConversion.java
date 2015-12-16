package com.rongpengli.leetcode.string;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        int length = s.length();
        if (length <= numRows) {
            return s;
        }
        StringBuilder lStringBuilder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < length; j = j + 2 * numRows - 2) {
                lStringBuilder.append(s.charAt(j));
                if (i != 0 && i != numRows - 1) {
                    int pos = j + 2 * (numRows - i) - 2;
                    if (pos < length) {
                        lStringBuilder.append(s.charAt(pos));
                    }
                }
            }
        }
        return lStringBuilder.toString();
    }

    public static void main(String[] args) {
        ZigZagConversion lZigZagConversion = new ZigZagConversion();
        System.out.println(lZigZagConversion.convert("a", 1));
    }

}
