package com.rongpengli.leetcode.list;

public class ReorderList {
    public void reorderList(ListNode head) {
        if (head != null) {
            int size = 0;
            ListNode h1Node = head, head2 = null;
            while (h1Node != null) {
                size++;
                h1Node = h1Node.next;
            }
            if (size > 2) {
                h1Node = head;
                for (int i = 0; i < (size + 1) / 2; i++) {
                    h1Node = h1Node.next;
                }
                head2 = reverseList(h1Node);
                h1Node = head;
                ListNode l1NodeHelper, l2NodeHelper;
                while (head2 != null) {
                    l1NodeHelper = h1Node.next;
                    l2NodeHelper = head2.next;
                    h1Node.next = head2;
                    head2.next = l1NodeHelper;
                    h1Node = l1NodeHelper;
                    head2 = l2NodeHelper;
                }
                if (h1Node != null) {
                    h1Node.next = null;
                }
            }
        }
    }

    private ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode lPrevious = head, lTemp, lHead = head.next;
        lPrevious.next = null;
        while (lHead.next != null) {
            lTemp = lHead;
            lHead = lHead.next;
            lTemp.next = lPrevious;
            lPrevious = lTemp;
        }
        lHead.next = lPrevious;
        return lHead;
    }

    private ListNode reverseList1(ListNode nextNode) {
        ListNode head = null;
        if (nextNode.next == null) {
            head = nextNode;
        } else {
            head = reverseList(nextNode.next);
            nextNode.next.next = nextNode;
            nextNode.next = null;
        }
        return head;
    }

    public static void main(String[] args) {
        ReorderList lReorderList = new ReorderList();
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(6);
        lReorderList.reorderList(head);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}
