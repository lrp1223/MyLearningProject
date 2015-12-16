package com.rongpengli.leetcode.string;

public class ReverseWordsinaString {
    public String reverseWords(String s) {
        if (s == null) {
            return s;
        }
        s = s.trim();
        if (s.equals("")) {
            return s;
        }
        s = reverse(s);

        String[] strArr = s.split(" ");
        StringBuilder lStringBuilder = new StringBuilder();
        for (String str : strArr) {
            if (!str.equals("")) {
                lStringBuilder.append(reverse(str));
                lStringBuilder.append(" ");
            }
        }
        lStringBuilder.setLength(lStringBuilder.length() - 1);
        return lStringBuilder.toString();
    }

    private String reverse(String s) {
        int length = s.length();
        StringBuilder lStringBuilder = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            lStringBuilder.append(s.charAt(i));
        }
        return lStringBuilder.toString();
    }

    public static void main(String[] args) {
        ReverseWordsinaString lReverseWordsinaString = new ReverseWordsinaString();
        System.out
                .println(lReverseWordsinaString.reverseWords("  This is    Rongpeng speaking   "));
    }

}
