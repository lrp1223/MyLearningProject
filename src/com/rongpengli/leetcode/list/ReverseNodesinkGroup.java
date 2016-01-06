package com.rongpengli.leetcode.list;

public class ReverseNodesinkGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        ListNode dummy = new ListNode(-1), previous = dummy;
        dummy.next = head;
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        while (true) {
            if (previous == null || length < k) {
                break;
            }
            previous = reverseCurrent(previous, k);
            length -= k;
        }
        return dummy.next;
    }

    private ListNode reverseCurrent(ListNode previous, int k) {
        ListNode temp, head = previous.next, tail = head, result = null;
        int i = 0;
        while (head != null && i < k) {
            temp = head.next;
            head.next = result;
            result = head;
            previous.next = head;
            head = temp;
            i++;
        }
        if (tail != null) {
            tail.next = head;
        }
        return tail;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 5 };
        ListNode head = new ListNode(1), previous = head;
        for (int i : nums) {
            previous.next = new ListNode(i);
            previous = previous.next;
        }

        ReverseNodesinkGroup lReverseNodesinkGroup = new ReverseNodesinkGroup();
        head = lReverseNodesinkGroup.reverseKGroup(head, 3);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}
