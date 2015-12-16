package com.rongpengli.leetcode;

public class InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1 == null || s2 == null || s3 == null) {
            return false;
        }
        int[][] step = new int[s1.length()][s2.length()];
        boolean isInterLeave = true;
        return isInterLeave;
    }

    // public boolean isInterleave(String s1, String s2, String s3, int[][]
    // steps) {
    // int lLength1 = s1.length(), lLength2 = s2.length(), lLength3 =
    // s3.length();
    // if (lLength1 + lLength2 != lLength3) {
    // return false;
    // }
    // if (lLength1 == 0) {
    // return s2.equals(s3);
    // }
    // if (lLength2 == 0) {
    // return s1.equals(s3);
    // }
    // boolean isInterLeave = false;
    // if (s1.charAt(0) == s3.charAt(0)) {
    // isInterLeave = isInterleave(s1.substring(1), s2, s3.substring(1));
    // } else {
    // steps[i].length
    // }
    // if (!isInterLeave && s2.charAt(0) == s3.charAt(0)) {
    // isInterLeave = isInterleave(s1, s2.substring(1), s3.substring(1));
    // }
    // }

    public static void main(String[] args) {
        InterleavingString lInterleavingString = new InterleavingString();
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac", s4 = "aadbbbaccc";
        System.out.println(lInterleavingString.isInterleave(s1, s2, s3));
        System.out.println(lInterleavingString.isInterleave(s1, s2, s4));

        String a1 = "bbbbbabbbbabaababaaaabbababbaaabbabbaaabaaaaababbbababbbbbabbbbababbabaabababbbaabababababbbaaababaa";
        String a2 = "babaaaabbababbbabbbbaabaabbaabbbbaabaaabaababaaaabaaabbaaabaaaabaabaabbbbbbbbbbbabaaabbababbabbabaab";
        String a3 = "babbbabbbaaabbababbbbababaabbabaabaaabbbbabbbaaabbbaaaaabbbbaabbaaabababbaaaaaabababbababaababbababbbababbbbaaaabaabbabbaaaaabbabbaaaabbbaabaaabaababaababbaaabbbbbabbbbaabbabaabbbbabaaabbababbabbabbab";
        System.out.println(lInterleavingString.isInterleave(a1, a2, a3));
    }
}
