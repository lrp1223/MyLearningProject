package com.rongpengli.leetcode.string;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s == null || s.equals("")) {
            return true;
        }
        Stack<Character> lStack = new Stack<Character>();
        while (s.length() > 0) {
            if (lStack.isEmpty()) {
                lStack.push(s.charAt(0));
            } else {
                Character ch1 = lStack.pop();
                Character ch2 = s.charAt(0);
                if (!isMatch(ch1, ch2)) {
                    lStack.push(ch1);
                    lStack.push(ch2);
                }
            }
            s = s.substring(1);
        }
        return lStack.isEmpty();
    }

    boolean isMatch(char ch1, char ch2) {
        return ch1 == '(' && ch2 == ')' || ch1 == '[' && ch2 == ']' || ch1 == '{' && ch2 == '}';
    }

    public static void main(String[] args) {
        ValidParentheses lValidParentheses = new ValidParentheses();
        System.out.println(lValidParentheses.isValid("{[]}"));
    }

}
