package com.rongpengli.leetcode.other;

public class ExcelColumnNumber {
    public int titleToNumber(String s) {
        s = s.toUpperCase();
        int column = 0;
        for (int i = 0; i < s.length(); i++) {
            column = column * 26 + (s.charAt(i) - 'A' + 1);
        }
        return column;
    }

    public String convertToTitle(int n) {
        StringBuilder lStringBuilder = new StringBuilder();
        while (n > 0) {
            if (n % 26 > 0) {
                lStringBuilder.append((char) ('A' + n % 26 - 1));
                n = n / 26;
            } else {
                lStringBuilder.append('Z');
                n = n / 26 - 1;
            }
        }
        return lStringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        ExcelColumnNumber lExcelColumnNumber = new ExcelColumnNumber();
        System.out.println(lExcelColumnNumber.titleToNumber("AZC"));
        System.err.println(lExcelColumnNumber.convertToTitle(1355));
    }
}
