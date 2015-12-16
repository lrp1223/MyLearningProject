package com.rongpengli.leetcode.binarytree;

public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return minDepthHelper(root, 1);
    }

    public int minDepthHelper(TreeNode root, int current) {
        if (root.left == null && root.right == null) {
            return current;
        }
        if (root.left == null) {
            return minDepthHelper(root.right, current + 1);
        } else if (root.right == null) {
            return minDepthHelper(root.left, current + 1);
        } else {
            return Math.min(minDepthHelper(root.left, current + 1),
                    minDepthHelper(root.right, current + 1));
        }
    }

    public static void main(String[] args) {
        MinimumDepthofBinaryTree lMinimumDepthofBinaryTree = new MinimumDepthofBinaryTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        // root.right = new TreeNode(4);
        System.out.println(lMinimumDepthofBinaryTree.minDepth(root));
    }
}
