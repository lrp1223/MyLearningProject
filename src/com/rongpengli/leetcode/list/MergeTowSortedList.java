package com.rongpengli.leetcode.list;

public class MergeTowSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = null, lhead;
        if (l1.val > l2.val) {
            head = l2;
            l2 = l2.next;
        } else {
            head = l1;
            l1 = l1.next;
        }
        lhead = head;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                lhead.next = l2;
                l2 = l2.next;
            } else {
                lhead.next = l1;
                l1 = l1.next;
            }
            lhead = lhead.next;
        }
        lhead.next = l1 == null ? l2 : l1;
        return head;
    }

    public static void main(String[] args) {
        MergeTowSortedList lMergeTowSortedList = new MergeTowSortedList();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(10);

        ListNode l2 = new ListNode(7);
        l2.next = new ListNode(8);

        ListNode lNew = lMergeTowSortedList.mergeTwoLists(l1, l2);
        while (lNew != null) {
            System.out.println(lNew.val);
            lNew = lNew.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}