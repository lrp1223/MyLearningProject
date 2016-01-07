package com.rongpengli.leetcode.list;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = new ListNode(-1), largeHead = new ListNode(-1), temp1 = smallHead,
                temp2 = largeHead;
        while (head != null) {
            if (head.val < x) {
                temp1.next = head;
                temp1 = temp1.next;
            } else {
                temp2.next = head;
                temp2 = temp2.next;
            }
            head = head.next;
        }
        temp1.next = null;
        temp2.next = null;
        if (smallHead.next == null) {
            return largeHead.next;
        } else {
            temp1.next = largeHead.next;
            return smallHead.next;
        }
    }

    public static void main(String[] args) {
        ListNode headD = new ListNode(-1), temp = headD;
        int[] nums = { 1, 4, 3, 2, 5, 2 };
        for (int val : nums) {
            temp.next = new ListNode(val);
            temp = temp.next;
        }

        PartitionList lPartitionList = new PartitionList();
        headD = lPartitionList.partition(headD.next, 6);
        while (headD != null) {
            System.out.println(headD.val);
            headD = headD.next;
        }
    }

}
