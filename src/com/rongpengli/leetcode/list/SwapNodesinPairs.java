package com.rongpengli.leetcode.list;

public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fake = new ListNode(0), listHead = fake;

        while (head != null && head.next != null) {
            listHead.next = head.next;
            head.next = head.next.next;
            listHead.next.next = head;
            listHead = head;
            head = head.next;

        }
        return fake.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(8);
        head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(6);

        SwapNodesinPairs lSwapNodesinPairs = new SwapNodesinPairs();
        head = lSwapNodesinPairs.swapPairs(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}
