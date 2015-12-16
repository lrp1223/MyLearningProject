package com.rongpengli.leetcode.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root != null) {
            Queue<TreeNode> lQueue = new LinkedList<TreeNode>();
            lQueue.add(root);
            int current, previous = 1;
            TreeNode head, nextNode;
            while (!lQueue.isEmpty()) {
                head = null;
                current = 0;
                for (int i = 0; i < previous; i++) {
                    nextNode = lQueue.remove();
                    if (nextNode.right != null) {
                        lQueue.add(nextNode.right);
                        current++;
                    }
                    if (nextNode.left != null) {
                        lQueue.add(nextNode.left);
                        current++;
                    }
                    if (head == null) {
                        head = nextNode;
                        result.add(head.val);
                    }
                }
                previous = current;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);

        BinaryTreeRightSideView lBinaryTreeRightSideView = new BinaryTreeRightSideView();
        List<Integer> result = lBinaryTreeRightSideView.rightSideView(root);
        for (Integer value : result) {
            System.out.println(value);
        }
    }
}
