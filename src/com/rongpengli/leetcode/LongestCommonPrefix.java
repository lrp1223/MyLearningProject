package com.rongpengli.leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    // Complex and bad one
    // String.subString(0,x)--x can be the length of the string, if x ==1, get
    // the first character
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1 || strs[0].equals("")) {
            return strs[0];
        }
        int j = 1;
        boolean find = false;
        for (; j <= strs[0].length(); j++) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() < j) {
                    find = true;
                    break;
                }
                if (!strs[i].substring(0, j).equals(strs[0].substring(0, j))) {
                    find = true;
                    break;
                }
            }
            if (find) {
                break;
            }
        }
        return strs[0].substring(0, j - 1);
    }

    public String longestCommonPrefix1(String[] strs) {
        StringBuilder result = new StringBuilder();
        if (strs != null && strs.length > 0) {
            Arrays.sort(strs);
            char[] l1 = strs[0].toCharArray();
            char[] l2 = strs[strs.length - 1].toCharArray();
            for (int i = 0; i < l1.length; i++) {
                if (l2.length > i && l1[i] == l2[i]) {
                    result.append(l1[i]);
                } else {
                    return result.toString();
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefix lLongestCommonPrefix = new LongestCommonPrefix();
        String[] strs = { "ccca", "c" };
        System.out.println(lLongestCommonPrefix.longestCommonPrefix(strs));
    }

}
