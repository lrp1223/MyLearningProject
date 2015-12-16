package com.rongpengli.leetcode.design;

import java.util.Stack;

public class BinarySearchTreeIterator {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        BSTIterator lBstIterator = new BSTIterator(root);
        while (lBstIterator.hasNext()) {
            System.out.println(lBstIterator.next());
        }
    }

}

class BSTIterator {
    private final Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode root = stack.pop();
        int result = root.val;
        if (root.right != null) {
            root = root.right;
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
        }
        return result;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}