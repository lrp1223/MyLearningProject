package com.rongpengli.leetcode.list;

import java.util.HashMap;
import java.util.Map;

public class CopyListwithRandomPointer {
    // Bad method--use hashmap
    public RandomListNode copyRandomList2(RandomListNode head) {
        if (head == null) {
            return null;
        }
        RandomListNode newHead = new RandomListNode(head.label), temp = newHead, temp2 = head;
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        map.put(head, newHead);
        while (temp2.next != null) {
            temp.next = new RandomListNode(temp2.next.label);
            map.put(temp2.next, temp.next);
            temp2 = temp2.next;
            temp = temp.next;
        }
        temp = newHead;
        temp2 = head;
        while (temp2 != null) {
            if (temp2.random == null) {
                temp.random = null;
            } else {
                temp.random = map.get(temp2.random);
            }
            temp = temp.next;
            temp2 = temp2.next;
        }

        return newHead;
    }

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }
        RandomListNode temp = head, another = new RandomListNode(-1), temp2 = another;
        while (temp != null) {
            RandomListNode copyNode = new RandomListNode(temp.label);
            copyNode.next = temp.next;
            temp.next = copyNode;
            temp = temp.next.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.random == null) {
                temp.next.random = null;
            } else {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        temp = head;
        while (temp != null) {
            temp2.next = temp.next;
            temp2 = temp2.next;
            temp.next = temp.next.next;
            temp = temp.next;
        }
        return another.next;
    }

    public static void main(String[] args) {

    }

}

class RandomListNode {
    int label;
    RandomListNode next, random;

    RandomListNode(int x) {
        label = x;
    }
};