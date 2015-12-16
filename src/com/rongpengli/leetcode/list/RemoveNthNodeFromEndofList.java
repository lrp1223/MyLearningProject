package com.rongpengli.leetcode.list;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head, second = head;
        while (first != null && n > 0) {
            first = first.next;
            n--;
        }

        if (first == null) {
            head = head.next;
        } else {
            while (first.next != null) {
                first = first.next;
                second = second.next;
            }
            if (second.next != null) {
                second.next = second.next.next;
            } else {
                head = null;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        RemoveNthNodeFromEndofList lRemoveNthNodeFromEndofList = new RemoveNthNodeFromEndofList();
        head = lRemoveNthNodeFromEndofList.removeNthFromEnd(head, 2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}
