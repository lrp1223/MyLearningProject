package com.rongpengli.leetcode;

public class DeleteNode {
    public ListNode removeElements(ListNode head, int val) {
        while (head.val == val) {
            if (head.next == null) {
                return null;
            }
            head = head.next;
        }
        ListNode lhead1 = head;
        while (lhead1.next != null) {
            if (lhead1.next.val == val) {
                lhead1.next = lhead1.next.next;
            } else {
                lhead1 = lhead1.next;
            }

        }
        return head;
    }

    public int removeELement(int[] nums, int val) {
        int i = 0, j = 0;
        for (; i + j < nums.length;) {
            if (nums[i + j] == val) {
                j++;
            } else {
                nums[i] = nums[i + j];
                i++;
            }
        }
        return i;
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode lHead = head, lSecond = head.next;
        while (lSecond != null) {
            if (lSecond.val == lHead.val) {
                lHead.next = lSecond.next;
            } else {
                lHead = lSecond;
            }
            lSecond = lSecond.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode lHead = new ListNode(1);
        lHead.next = new ListNode(1);
        lHead.next.next = new ListNode(2);
        lHead.next.next.next = new ListNode(3);
        lHead.next.next.next.next = new ListNode(3);

        DeleteNode lDeleteNode = new DeleteNode();
        // lHead = lDeleteNode.removeElements(lHead, 1);
        // while (lHead != null) {
        // System.out.println(lHead.val + "->");
        // lHead = lHead.next;
        // }
        // int[] nums = { 4, 5 };
        // int count = lDeleteNode.removeELement(nums, 4);
        // System.out.println(count);
        // for (int i = 0; i < count; i++) {
        // System.out.println(nums[i]);
        // }
        lHead = lDeleteNode.deleteDuplicates(lHead);
        while (lHead != null) {
            System.err.println(lHead.val);
            lHead = lHead.next;
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
