package com.rongpengli.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root != null) {
            preOrder(root, result);
        }
        return result;
    }

    private void preOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root != null) {
            Stack<TreeNode> lStack = new Stack<TreeNode>();
            lStack.push(root);
            while (!lStack.isEmpty()) {
                TreeNode head = lStack.pop();
                result.add(head.val);
                if (head.right != null) {
                    lStack.push(head.right);
                }
                if (head.left != null) {
                    lStack.push(head.left);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        BinaryTreePreorderTraversal lBinaryTreePreorderTraversal = new BinaryTreePreorderTraversal();
        List<Integer> result = lBinaryTreePreorderTraversal.preorderTraversal(root);
        for (Integer value : result) {
            System.out.println(value);
        }
    }
}
