package com.rongpengli.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root != null) {
            Stack<TreeNode> lStack = new Stack<TreeNode>();
            TreeNode head = root;
            while (head != null) {
                lStack.push(head);
                head = head.left;
            }
            while (!lStack.isEmpty()) {
                head = lStack.pop();
                result.add(head.val);
                head = head.right;
                while (head != null) {
                    lStack.push(head);
                    head = head.left;
                }
            }
        }
        return result;
    }

    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root != null) {
            inOrder(root, result);
        }
        return result;
    }

    private void inOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inOrder(root.left, result);
        result.add(root.val);
        inOrder(root.right, result);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        BinaryTreeInorderTraversal lBinaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
        List<Integer> result = lBinaryTreeInorderTraversal.inorderTraversal(root);
        for (Integer value : result) {
            System.out.println(value);
        }
    }

}
