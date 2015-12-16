package com.rongpengli.leetcode;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x > 0 && x % 10 == 0) {
            return false;
        }

        int num = 0;
        while (num < x) {
            num = num * 10 + x % 10;
            if (num == x) {
                break;
            }
            x = x / 10;
        }
        return num == x;

    }

    public boolean isPalindrome(ListNode head) {
        ListNode lHead = head;
        int lSize = 0;
        while (lHead != null) {
            lSize++;
            lHead = lHead.next;
        }
        if (lSize == 0 || lSize == 1) {
            return true;
        }

        lHead = head;
        for (int i = 0; i < (lSize + 1) / 2; i++) {
            lHead = lHead.next;
        }

        lHead = reverseList(lHead);
        while (lHead != null) {
            if (lHead.val != head.val) {
                return false;
            }
            lHead = lHead.next;
            head = head.next;
        }

        return true;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode root = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return root;
    }

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int lLength = s.length();
        StringBuilder lStringBuilder = new StringBuilder();
        for (int i = 0; i < lLength; i++) {
            char lChar = s.charAt(i);
            if ((lChar >= 'A' && lChar <= 'Z') || (lChar >= 'a' && lChar <= 'z')
                    || (lChar >= '0' && lChar <= '9')) {
                lStringBuilder.append(lChar);
            }
        }
        s = lStringBuilder.toString();
        lLength = s.length();
        lStringBuilder.setLength(0);
        for (int i = lLength - 1; i >= 0; i--) {
            lStringBuilder.append(s.charAt(i));
        }
        if (s.equalsIgnoreCase(lStringBuilder.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Palindrome lPalindrome = new Palindrome();
        // System.out.println(lPalindrome.isPalindrome(0));

        ListNode lHead = new ListNode(1);
        lHead.next = new ListNode(1);
        lHead.next.next = new ListNode(1);
        // System.out.println(lPalindrome.isPalindrome(lHead));
        // lHead.next.next.next = new ListNode(3);

        System.out.println(lPalindrome.isPalindrome("race 1   21e car"));
    }

}
