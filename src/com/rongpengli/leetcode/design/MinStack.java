package com.rongpengli.leetcode.design;

public class MinStack {
    class Node {
        int val, min;
        Node next;

        public Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    Node head = null;

    public void push(int x) {
        if (head == null) {
            head = new Node(x, x);
        } else {
            int min = head.min > x ? x : head.min;
            Node next = new Node(x, min);
            next.next = head;
            head = next;
        }
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public int top() {
        if (head != null) {
            return head.val;
        } else {
            return -1;
        }
    }

    public int getMin() {
        if (head != null) {
            return head.min;
        } else {
            return -1;
        }
    }

    // public static void main(String[] args) {
    // // TODO Auto-generated method stub
    //
    // }

}
