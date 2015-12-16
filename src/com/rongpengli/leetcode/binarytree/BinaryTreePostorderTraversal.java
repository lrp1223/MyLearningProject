package com.rongpengli.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            postOrder(root, result);
        }
        return result;
    }

    private void postOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        postOrder(root.left, result);
        postOrder(root.right, result);
        result.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        TreeNode head = root;
        if (head != null) {
            Stack<TreeNode> lStack = new Stack<TreeNode>();
            while (head != null) {
                lStack.push(head);
                head = head.left;
            }
            TreeNode previous = null;
            while (!lStack.isEmpty()) {
                head = lStack.peek();
                if (head.right == previous || head.right == null) {
                    previous = lStack.pop();
                    result.add(previous.val);
                } else {
                    head = head.right;
                    previous = null;
                    lStack.push(head);
                    while (head.left != null) {
                        head = head.left;
                        lStack.push(head);
                    }
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(0);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        BinaryTreePostorderTraversal lBinaryTreePostorderTraversal = new BinaryTreePostorderTraversal();
        List<Integer> result = lBinaryTreePostorderTraversal.postorderTraversal(root);
        for (Integer value : result) {
            System.out.println(value);
        }
    }

}
