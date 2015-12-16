package com.rongpengli.leetcode.list;

public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode head1 = headA, head2 = headB;
        int sizeA = 0, sizeB = 0, temp;
        while (head1 != null) {
            head1 = head1.next;
            sizeA++;
        }
        while (head2 != null) {
            head2 = head2.next;
            sizeB++;
        }
        head1 = headA;
        head2 = headB;
        if (sizeA > sizeB) {
            temp = sizeA - sizeB;
            while (temp > 0) {
                head1 = head1.next;
                temp--;
            }
        } else {
            temp = sizeB - sizeA;
            while (temp > 0) {
                head2 = head2.next;
                temp--;
            }
        }
        while (head1 != null) {
            if (head1 == head2) {
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(3);
        l2.next = l1.next.next;
        IntersectionofTwoLinkedLists lIntersectionofTwoLinkedLists = new IntersectionofTwoLinkedLists();
        System.out.println(lIntersectionofTwoLinkedLists.getIntersectionNode(l1, l2).val);
    }

}
