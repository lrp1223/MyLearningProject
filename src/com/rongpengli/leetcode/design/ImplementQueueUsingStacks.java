package com.rongpengli.leetcode.design;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementQueueUsingStacks {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}

class MyQueue {
    private final Queue<Integer> queue1 = new LinkedList<Integer>();
    private final Queue<Integer> queue2 = new LinkedList<Integer>();

    public void push(int x) {
        queue1.add(x);
    }

    public void pop() {
        if (!queue2.isEmpty()) {
            queue2.remove();
            return;
        }
        while (!queue1.isEmpty()) {
            Integer lInt = queue1.remove();
            queue2.add(lInt);
        }
        if (queue2.isEmpty()) {
            return;
        }
        queue2.remove();
    }

    public int peek() {
        if (!queue2.isEmpty()) {
            return queue2.peek();
        }
        while (!queue1.isEmpty()) {
            Integer lInt = queue1.remove();
            queue2.add(lInt);
        }
        if (queue2.isEmpty()) {
            return 0;
        }
        return queue2.peek();
    }

    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}