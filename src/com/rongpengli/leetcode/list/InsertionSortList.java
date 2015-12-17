package com.rongpengli.leetcode.list;

public class InsertionSortList {
    public ListNode insertionSortList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next.next, newNext = head.next, head2;
        head.next = null;
        boolean find;
        while (newNext != null) {
            head2 = head;
            if (newNext.val <= head.val) {
                newNext.next = head;
                head = newNext;
            } else {
                find = false;
                while (head2.next != null) {
                    if (head2.val <= newNext.val && head2.next.val >= newNext.val) {
                        newNext.next = head2.next;
                        head2.next = newNext;
                        find = true;
                        break;
                    }
                    head2 = head2.next;
                }
                if (!find) {
                    head2.next = newNext;
                    newNext.next = null;
                }
            }
            newNext = newHead;
            if (newHead != null) {
                newHead = newHead.next;
            }
        }
        return head;
    }

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fake = new ListNode(0), p, next = null, curr = head;
        while (curr != null) {
            next = curr.next;
            p = fake;
            while (p.next != null && p.next.val < curr.val) {
                p = p.next;
            }
            curr.next = p.next;
            p.next = curr;
            curr = next;
        }
        return fake.next;
    }

    public static void main(String[] args) {
        InsertionSortList lInsertionSortList = new InsertionSortList();

        ListNode head = new ListNode(10);
        head.next = new ListNode(15);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(12);
        head = lInsertionSortList.insertionSortList(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}
