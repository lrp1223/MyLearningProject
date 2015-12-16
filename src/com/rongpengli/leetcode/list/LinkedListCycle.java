package com.rongpengli.leetcode.list;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode head1 = head, head2 = head;
        while (head2 != null && head2.next != null) {
            head1 = head1.next;
            head2 = head2.next.next;
            if (head1 == head2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { -21, 10, 17, 8, 4, 26, 5, 35, 33, -7, -16, 27, -12, 6, 29, -12, 5, 9, 20,
                14, 14, 2, 13, -24, 21, 23, -21, 5 };
        ListNode head = new ListNode(nums[0]);
        ListNode head1 = head;
        for (int i = 1; i < nums.length; i++) {
            head1.next = new ListNode(nums[i]);
            head = head1.next;
        }

        LinkedListCycle lLinkedListCycle = new LinkedListCycle();
        System.out.println(lLinkedListCycle.hasCycle(head));
    }

}
