package com.rongpengli.leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {
    public boolean wordBreak(String s, Set<String> wordDict) {
        for (String str : wordDict) {
            if (s.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        WordBreak lWordBreak = new WordBreak();

        Set<String> lSet = new HashSet<String>();
        lSet.add("leet");
        lSet.add("code");
        System.out.println(lWordBreak.wordBreak("leetcode", lSet));
    }

}
