package com.rongpengli.leetcode.list;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode head = l1, head2 = l2, previous = new ListNode(-1);
        ListNode nextNode = previous;
        int carry = 0, sum;
        while (head != null && head2 != null) {
            sum = carry + head.val + head2.val;
            nextNode.next = new ListNode(sum % 10);
            nextNode = nextNode.next;
            carry = sum / 10;
            head = head.next;
            head2 = head2.next;
        }
        while (head != null) {
            sum = carry + head.val;
            nextNode.next = new ListNode(sum % 10);
            nextNode = nextNode.next;
            head = head.next;
            carry = sum / 10;
        }
        while (head2 != null) {
            sum = carry + head2.val;
            nextNode.next = new ListNode(sum % 10);
            nextNode = nextNode.next;
            head2 = head2.next;
            carry = sum / 10;
        }
        if (carry > 0) {
            nextNode.next = new ListNode(1);
        }
        return previous.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers lAddTwoNumbers = new AddTwoNumbers();

        int[] nums1 = { 3, 1, 0, 0, 1, 9, 0, 1, 6, 1 };
        int[] nums2 = { 5, 5, 8, 6, 2, 5, 8, 2, 6, 1 };

        ListNode l1 = new ListNode(nums1[0]);
        ListNode l2 = new ListNode(nums2[0]);

        ListNode head1 = l1, head2 = l2;
        for (int i = 1; i < nums1.length; i++) {
            head1.next = new ListNode(nums1[i]);
            head1 = head1.next;
            head2.next = new ListNode(nums2[i]);
            head2 = head2.next;
        }

        ListNode head = lAddTwoNumbers.addTwoNumbers(l1, l2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
