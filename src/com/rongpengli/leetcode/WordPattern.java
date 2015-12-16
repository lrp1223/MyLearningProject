package com.rongpengli.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        boolean lResult = true;

        String[] lStr = str.split(" ");
        if (pattern.length() == lStr.length) {
            Map<Character, String> lIndexToStr = new HashMap<Character, String>();
            for (int i = 0; i < lStr.length; i++) {
                if (lIndexToStr.containsKey(pattern.charAt(i))) {
                    if (!lIndexToStr.get(pattern.charAt(i)).equals(lStr[i])) {
                        lResult = false;
                        break;
                    }
                } else {
                    if (lIndexToStr.containsValue(lStr[i])) {
                        lResult = false;
                        break;
                    } else {
                        lIndexToStr.put(pattern.charAt(i), lStr[i]);
                    }
                }
            }

        } else {
            lResult = false;
        }

        return lResult;
    }

    public static void main(String[] args) {
        WordPattern lWordPattern = new WordPattern();
        System.out.println(lWordPattern.wordPattern("abba", "cat dog dog dog"));
    }

}
