package com.rongpengli.leetcode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode lPrevious = head, lTemp, lHead = head.next;
        lPrevious.next = null;
        while (lHead.next != null) {
            lTemp = lHead;
            lHead = lHead.next;
            lTemp.next = lPrevious;
            lPrevious = lTemp;
        }
        lHead.next = lPrevious;
        return lHead;
    }

    public static void main(String[] args) {
        ReverseLinkedList lReverseLinkedList = new ReverseLinkedList();

        ListNode lHead = new ListNode(1);
        lHead.next = new ListNode(2);
        // lHead.next.next = new ListNode(6);
        // lHead.next.next.next = new ListNode(3);

        lHead = lReverseLinkedList.reverseList(lHead);
        while (lHead != null) {
            System.out.println(lHead.val);
            lHead = lHead.next;
        }
    }

}
