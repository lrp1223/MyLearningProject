package com.rongpengli.leetcode.design;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(4);
        myStack.push(5);
        myStack.pop();
        System.out.println(myStack.top());
        System.out.println(myStack.empty());
    }

}

class MyStack {
    private final Queue<Integer> queue1 = new LinkedList<Integer>();
    private final Queue<Integer> queue2 = new LinkedList<Integer>();
    private boolean first = true;

    // Push element x onto stack.
    public void push(int x) {
        if (first) {
            queue1.add(x);
        } else {
            queue2.add(x);
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        if (first) {
            while (queue1.size() > 1) {
                queue2.add(queue1.remove());
            }
            queue1.remove();
        } else {
            while (queue2.size() > 1) {
                queue1.add(queue2.remove());
            }
            queue2.remove();
        }
        first = !first;
    }

    // Get the top element.
    public int top() {
        Integer top = null;
        if (first) {
            while (queue1.size() > 1) {
                queue2.add(queue1.remove());
            }
            top = queue1.peek();
            queue2.add(queue1.remove());
        } else {
            while (queue2.size() > 1) {
                queue1.add(queue2.remove());
            }
            top = queue2.peek();
            queue1.add(queue2.remove());
        }
        first = !first;
        return top;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}