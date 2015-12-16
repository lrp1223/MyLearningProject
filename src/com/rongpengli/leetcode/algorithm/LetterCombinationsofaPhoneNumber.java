package com.rongpengli.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

// Backtracking
public class LetterCombinationsofaPhoneNumber {
    Character[][] phoneChars = { { ' ' }, { ' ' }, { 'a', 'b', 'c' }, { 'd', 'e', 'f' },
            { 'g', 'h', 'i' }, { 'j', 'k', 'l' }, { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' },
            { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits != null && !digits.equals("")) {
            digitsHelper(digits, new StringBuilder(), result);
        }
        return result;
    }

    private void digitsHelper(String digits, StringBuilder exists, List<String> result) {
        if (digits.equals("")) {
            result.add(exists.toString());
        } else {
            int num = digits.charAt(0) - '0';
            for (int i = 0; i < phoneChars[num].length; i++) {
                exists.append(phoneChars[num][i]);
                digitsHelper(digits.substring(1), exists, result);
                exists.setLength(exists.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        LetterCombinationsofaPhoneNumber lLetterCombinationsofaPhoneNumber = new LetterCombinationsofaPhoneNumber();
        List<String> result = lLetterCombinationsofaPhoneNumber.letterCombinations("23");
        for (String str : result) {
            System.out.println(str);
        }
    }

}
