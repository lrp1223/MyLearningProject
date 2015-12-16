package com.rongpengli.leetcode;

public class RegularxpressionMatching {
    public boolean isMatch(String s, String p) {
        if (s == null && p == null) {
            return true;
        }
        if (s == null || p == null) {
            return false;
        }
        if (p.indexOf("*") < 0 && p.indexOf(".") < 0) {
            return s.equals(p);
        }
        boolean isMatch = match1(s, p);
        return isMatch;
    }

    public boolean match1(String s, String p) {
        while (s.length() > 0 && p.length() > 0) {
            if (p.charAt(1) == '*') {
                char first = s.charAt(0);
                if (p.charAt(0) != '.') {
                    first = p.charAt(0);
                }
                while (s.length() > 0) {
                    if (s.charAt(0) == first) {
                        s = s.substring(1);
                    } else {
                        break;
                    }
                }
                p = p.substring(2);
            } else {
                if (p.charAt(0) != '.' && p.charAt(0) != s.charAt(0)) {
                    return false;
                }
                p = p.substring(1);
                s = s.substring(1);
            }
        }
        return s.length() == 0 && p.length() == 0;
    }

    public static void main(String[] args) {
        RegularxpressionMatching lRegularxpressionMatching = new RegularxpressionMatching();
        System.out.println(lRegularxpressionMatching.isMatch("ab", ".*"));
    }

}
