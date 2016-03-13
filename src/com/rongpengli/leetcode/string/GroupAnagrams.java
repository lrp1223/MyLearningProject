package com.rongpengli.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        if (strs != null && strs.length > 0) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            boolean noNew = false;
            int previous = -1;
            while (true) {
                noNew = true;
                List<String> strList = new ArrayList<String>();
                for (int i = 0; i < strs.length; i++) {

                }
                if (noNew) {
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
