package com.rongpengli.leetcode.string;

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        StringBuilder lStringBuilder = new StringBuilder();
        if (s != null) {
            for (char i = 'a'; i < 'z'; i++) {
                if (s.indexOf(i) >= 0) {
                    lStringBuilder.append(i);
                }
            }
        }
        return lStringBuilder.toString();
    }

    public static void main(String[] args) {
        String lStr = "dfsfgfsggfsgwere";
        RemoveDuplicateLetters lRemoveDuplicateLetters = new RemoveDuplicateLetters();
        System.out.println(lRemoveDuplicateLetters.removeDuplicateLetters(lStr));
    }

}
