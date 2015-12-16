package com.rongpengli.leetcode;

public class AddBinary {
    public String addBinary1(String a, String b) {
        if (a == null || a == "") {
            return b;
        }
        if (b == null || b == "") {
            return a;
        }

        StringBuilder lStringBuilder = new StringBuilder();
        boolean lAdd = false;
        int i = a.length() - 1, j = b.length() - 1;
        for (; i >= 0 && j >= 0; i--, j--) {
            if (a.charAt(i) != b.charAt(j)) {
                if (lAdd) {
                    lStringBuilder.append("0");
                    lAdd = true;
                } else {
                    lStringBuilder.append("1");
                    lAdd = false;
                }
            } else {
                if (lAdd) {
                    lStringBuilder.append("1");
                } else {
                    lStringBuilder.append("0");
                }
                if (a.charAt(i) == '0') {
                    lAdd = false;
                } else {
                    lAdd = true;
                }
            }
        }

        for (; i >= 0; i--) {
            if (lAdd && a.charAt(i) == '1') {
                lStringBuilder.append("0");
            } else if (lAdd && a.charAt(i) == '0' || !lAdd && a.charAt(i) == '1') {
                lStringBuilder.append("1");
                lAdd = false;
            } else {
                lStringBuilder.append("0");
            }
        }
        for (; j >= 0; j--) {
            if (lAdd && b.charAt(j) == '1') {
                lStringBuilder.append("0");
            } else if (lAdd && b.charAt(j) == '0' || !lAdd && b.charAt(j) == '1') {
                lStringBuilder.append("1");
                lAdd = false;
            } else {
                lStringBuilder.append("0");
            }
        }
        if (lAdd) {
            lStringBuilder.append("1");
        }
        return lStringBuilder.reverse().toString();
    }

    public String addBinary(String a, String b) {
        StringBuilder lStringBuilder = new StringBuilder();
        int carry = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int i1 = i < 0 ? 0 : (a.charAt(i) - '0');
            int i2 = j < 0 ? 0 : (b.charAt(j) - '0');

            int var = i1 + i2 + carry;
            lStringBuilder.append(var % 2);
            carry = var / 2;
        }
        if (carry == 1) {
            lStringBuilder.append("1");
        }
        return lStringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary lAddBinary = new AddBinary();
        System.out.println(lAddBinary.addBinary("11", "1"));
    }

}
