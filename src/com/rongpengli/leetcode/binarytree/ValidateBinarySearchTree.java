package com.rongpengli.leetcode.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return true;
        }
        Queue<Integer> lQueue = new LinkedList<Integer>();
        travers(root, lQueue);

        int previous = lQueue.remove();
        while (!lQueue.isEmpty()) {
            int current = lQueue.remove();
            if (previous >= current) {
                return false;
            }
            previous = current;
        }
        return true;
    }

    private void travers(TreeNode node, Queue<Integer> lQueue) {
        if (node == null) {
            return;
        }
        travers(node.left, lQueue);
        lQueue.add(node.val);
        travers(node.right, lQueue);
    }

    public boolean isValidBST2(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return true;
        }
        return isBSTHelper(root, null, null);
    }

    private boolean isBSTHelper(TreeNode root, Integer left, Integer right) {
        if (root == null) {
            return true;
        }
        if (left != null && root.val <= left || right != null && root.val >= right) {
            return false;
        }
        return isBSTHelper(root.left, left, root.val) && isBSTHelper(root, root.val, right);
    }

    public static void main(String[] args) {
        ValidateBinarySearchTree lValidateBinarySearchTree = new ValidateBinarySearchTree();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(20);
        System.out.println(lValidateBinarySearchTree.isValidBST2(root));
    }

}
