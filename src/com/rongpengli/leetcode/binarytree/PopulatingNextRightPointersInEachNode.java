package com.rongpengli.leetcode.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode {
    public void connect(TreeLinkNode root) {
        if (root != null) {
            Queue<TreeLinkNode> lQueue = new LinkedList<TreeLinkNode>();
            lQueue.add(root);
            int current, previous = 1;
            TreeLinkNode head, next;
            while (!lQueue.isEmpty()) {
                current = 0;
                head = null;
                for (int i = 0; i < previous; i++) {
                    next = lQueue.remove();
                    if (head != null) {
                        head.next = next;
                    }
                    head = next;
                    if (head.left != null) {
                        lQueue.add(next.left);
                        current++;
                    }
                    if (head.right != null) {
                        lQueue.add(next.right);
                        current++;
                    }
                }
                head.next = null;
                previous = current;
            }
        }
    }

    public static void main(String[] args) {
        TreeLinkNode lTreeLinkNode = new TreeLinkNode(0);
        PopulatingNextRightPointersInEachNode lPopulatingNextRightPointersInEachNode = new PopulatingNextRightPointersInEachNode();
        lPopulatingNextRightPointersInEachNode.connect(lTreeLinkNode);
    }

}

class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;

    TreeLinkNode(int x) {
        val = x;
    }
}