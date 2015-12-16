package com.rongpengli.leetcode.string;

public class CompareVersionNumbers {
    public int compareVersion1(String version1, String version2) {
        if (version1 == null || version2 == null) {
            return 0;
        }
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");
        int small = str1.length > str2.length ? str2.length : str1.length;
        for (int i = 0; i < small; i++) {
            if (Integer.valueOf(str1[i]) > Integer.valueOf(str2[i])) {
                return 1;
            } else if (Integer.valueOf(str1[i]) < Integer.valueOf(str2[i])) {
                return -1;
            }
        }
        if (str1.length == str2.length) {
            return 0;
        }
        if (small < str2.length) {
            while (small < str2.length) {
                if (Integer.valueOf(str2[small++]) > 0) {
                    return -1;
                }
            }
        } else {
            while (small < str1.length) {
                if (Integer.valueOf(str1[small++]) > 0) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public int compareVersion(String version1, String version2) {
        if (version1 == null || version2 == null) {
            return 0;
        }
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");
        int i;
        for (i = 0; i < str1.length && i < str2.length; i++) {
            if (Integer.valueOf(str1[i]) > Integer.valueOf(str2[i])) {
                return 1;
            } else if (Integer.valueOf(str1[i]) < Integer.valueOf(str2[i])) {
                return -1;
            }
        }
        for (; i < str1.length; i++) {
            if (Integer.valueOf(str1[i]) > 0) {
                return 1;
            }
        }
        for (; i < str2.length; i++) {
            if (Integer.valueOf(str2[i]) > 0) {
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        CompareVersionNumbers lCompareVersionNumbers = new CompareVersionNumbers();
        System.out.println(lCompareVersionNumbers.compareVersion("1.0", "1.0.0.1"));
    }

}
