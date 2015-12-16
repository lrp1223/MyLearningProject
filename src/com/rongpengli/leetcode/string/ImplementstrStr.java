package com.rongpengli.leetcode.string;

public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if (haystack != null && needle != null) {
            if (haystack.equals("") && needle.equals("")) {
                return 0;
            }
            int length = haystack.length(), needleLength = needle.length();

            boolean find = true;
            for (int i = 0; i <= length - needleLength; i++) {
                find = true;
                for (int j = needleLength - 1; j >= 0; j--) {
                    if (haystack.charAt(j + i) != needle.charAt(j)) {
                        find = false;
                        break;
                    }
                }
                if (find) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ImplementstrStr lImplementstrStr = new ImplementstrStr();
        System.out.println(lImplementstrStr.strStr("zhejiangdaxue", "xuex"));
    }

}
