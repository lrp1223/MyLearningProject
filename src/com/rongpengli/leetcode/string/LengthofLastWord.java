package com.rongpengli.leetcode.string;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.trim().length() == 0) {
            return 0;
        }
        s = s.trim();
        String[] arr = s.trim().split(" ");
        if (arr.length == 1) {
            return s.length();
        }
        return arr[arr.length - 1].length();
    }

    public static void main(String[] args) {
        LengthofLastWord lengthofLastWord = new LengthofLastWord();
        System.out.println(lengthofLastWord.lengthOfLastWord("a  "));
    }

}
