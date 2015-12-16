package com.rongpengli.leetcode;

public class Rotate {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return;
        }
        k = k % nums.length;
        int lNum;
        for (int i = 0; i < nums.length / 2; i++) {
            lNum = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = lNum;
        }

        for (int i = 0; i < k / 2; i++) {
            lNum = nums[i];
            nums[i] = nums[k - 1 - i];
            nums[k - 1 - i] = lNum;
        }
        for (int i = 0; i < (nums.length - k) / 2; i++) {
            lNum = nums[i + k];
            nums[i + k] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = lNum;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode lHead = head;
        int size = 1;
        while (lHead.next != null) {
            size++;
            lHead = lHead.next;
        }
        lHead.next = head;

        k = k % size;
        lHead = head;
        // move size-k-1 steps and find the node set to null
        while (size - k - 1 > 0) {
            lHead = lHead.next;
            k++;
        }
        head = lHead.next;
        lHead.next = null;
        return head;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Rotate lRotate = new Rotate();
        lRotate.rotate(nums, 3);
        for (int i = 0; i < nums.length; i++) {
            // System.out.println(nums[i]);
        }

        ListNode lHead = new ListNode(1);
        lHead.next = new ListNode(3);
        lHead.next.next = new ListNode(4);
        lHead.next.next.next = new ListNode(6);
        lHead.next.next.next.next = new ListNode(8);
        lHead = lRotate.rotateRight(lHead, 4);
        while (lHead != null) {
            System.out.println(lHead.val);
            lHead = lHead.next;
        }
    }

}
