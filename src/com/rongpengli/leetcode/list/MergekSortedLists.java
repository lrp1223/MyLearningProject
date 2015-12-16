package com.rongpengli.leetcode.list;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        ListNode head = null, nextNode = null;
        PriorityQueue<ListNode> lQueue = new PriorityQueue<ListNode>(lists.length,
                new Comparator<ListNode>() {

                    @Override
                    public int compare(ListNode o1, ListNode o2) {
                        if (o1.val < o2.val) {
                            return -1;
                        } else if (o1.val > o2.val) {
                            return 1;
                        }
                        return 0;
                    }
                });
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                lQueue.add(lists[i]);
            }
        }
        if (lQueue.size() >= 1) {
            head = nextNode = lQueue.remove();
            if (nextNode.next != null) {
                lQueue.add(nextNode.next);
            }
        }
        while (!lQueue.isEmpty()) {
            nextNode.next = lQueue.remove();
            nextNode = nextNode.next;
            if (nextNode.next != null) {
                lQueue.add(nextNode.next);
            }

        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(10);
        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(8);
        l2.next.next = new ListNode(12);
        ListNode l3 = null;
        ListNode[] lists = { l1, l2, l3 };

        MergekSortedLists lMergekSortedLists = new MergekSortedLists();
        ListNode head = lMergekSortedLists.mergeKLists(lists);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}
