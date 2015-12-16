package com.rongpengli.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GenerateParentheses {
    public List<String> generateParenthesis1(int n) {
        List<String> result = new ArrayList<String>();
        generatorHelper(n, n, "", result);
        return result;
    }

    private void generatorHelper(int left, int right, String s, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(s);
        } else {
            if (left > 0) {
                generatorHelper(left - 1, right, s + "(", result);
            }
            if (right > left) {
                generatorHelper(left, right - 1, s + ")", result);
            }
        }

    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        result.addAll(generate(n));
        return result;
    }

    public Set<String> generate(int n) {
        if (n == 1) {
            Set<String> set = new HashSet<String>();
            set.add("()");
            return set;
        } else {
            Set<String> set = new HashSet<String>();
            Set<String> setTemp = generate(n - 1);
            Iterator<String> it = setTemp.iterator();
            while (it.hasNext()) {
                String value = it.next();
                for (int i = 0; i <= value.length() - 1; i++) {
                    set.add(value.substring(0, i) + "()" + value.substring(i, value.length()));
                }
            }
            return set;
        }
    }

    public static void main(String[] args) {
        GenerateParentheses lGenerateParentheses = new GenerateParentheses();
        List<String> result = lGenerateParentheses.generateParenthesis(4);
        for (String value : result) {
            System.out.println(value);
        }
        System.out.println(result.size());
    }

}
