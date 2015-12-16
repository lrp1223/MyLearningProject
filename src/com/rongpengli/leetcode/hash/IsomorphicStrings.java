package com.rongpengli.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> lMap = new HashMap<Character, Character>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (!lMap.containsKey(s.charAt(i)) && !lMap.containsValue(t.charAt(i))) {
                lMap.put(s.charAt(i), t.charAt(i));
            } else if (!lMap.containsKey(s.charAt(i)) || lMap.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings lIsomorphicStrings = new IsomorphicStrings();
        System.out.println(lIsomorphicStrings.isIsomorphic("paper", "title"));
        System.out.println(lIsomorphicStrings.isIsomorphic("bad", "baa"));
    }

}
