package com.rongpengli.leetcode.list;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                int lenght = 0;
                ListNode result = slow;
                ListNode head1 = head;
                while (head1 != slow) {
                    lenght++;
                    head1 = head1.next;
                }
                int small = lenght;
                slow = slow.next;
                while (slow != fast) {
                    head1 = head;
                    lenght = 0;
                    while (head1 != slow) {
                        lenght++;
                        head1 = head1.next;
                    }
                    if (lenght < small) {
                        small = lenght;
                        result = slow;
                    }
                    slow = slow.next;
                }
                return result;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        LinkedListCycleII linkedListCycleII = new LinkedListCycleII();
        System.out.println(linkedListCycleII.detectCycle(head).val);
    }

}
