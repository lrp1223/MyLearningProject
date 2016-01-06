package com.rongpengli.leetcode.list;

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head != null) {
            ListNode newHead = head, temp, tempTail, result = null, previous = null;
            int i = 1;
            for (; i < m; i++) {
                previous = newHead;
                newHead = newHead.next;
            }
            tempTail = newHead;
            while (newHead != null && i <= n) {
                temp = newHead.next;
                newHead.next = result;
                result = newHead;
                newHead = temp;
                i++;
            }
            tempTail.next = newHead;
            if (m == 1) {
                head = result;
            } else {
                previous.next = result;
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

        ReverseLinkedListII lReverseLinkedListII = new ReverseLinkedListII();
        head = lReverseLinkedListII.reverseBetween(head, 1, 5);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}
