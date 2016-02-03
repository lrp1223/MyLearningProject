package com.rongpengli.leetcode.list;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode oddDummy = new ListNode(-1), evenDummy = new ListNode(-1), odd = oddDummy,
                even = evenDummy;
        boolean isOdd = true;
        while (head != null) {
            if (isOdd) {
                odd.next = head;
                odd = odd.next;
            } else {
                even.next = head;
                even = even.next;
            }
            isOdd = !isOdd;
            head = head.next;
        }
        even.next = null;
        odd.next = evenDummy.next;
        return oddDummy.next;
    }

    public static void main(String[] args) {
        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();

        int[] nums = { 1, 2, 3, 4, 5 };
        ListNode head = new ListNode(nums[0]), nextNode = head;
        for (int i = 1; i < nums.length; i++) {
            nextNode.next = new ListNode(nums[i]);
            nextNode = nextNode.next;
        }
        head = oddEvenLinkedList.oddEvenList(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}
