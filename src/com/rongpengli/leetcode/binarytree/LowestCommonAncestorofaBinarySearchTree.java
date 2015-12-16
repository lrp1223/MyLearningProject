package com.rongpengli.leetcode.binarytree;

public class LowestCommonAncestorofaBinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode result = null;
        if (root != null) {
            if (p == null) {
                result = q;
            } else if (q == null) {
                result = p;
            } else {
                TreeNode node = root;
                while (node != null) {
                    if (node.val < p.val && node.val < q.val) {
                        node = node.right;
                    } else if (node.val > p.val && node.val > q.val) {
                        node = node.left;
                    } else {
                        result = node;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LowestCommonAncestorofaBinarySearchTree lowestCommonAncestorofaBinarySearchTree = new LowestCommonAncestorofaBinarySearchTree();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(18);
        System.out.println(lowestCommonAncestorofaBinarySearchTree.lowestCommonAncestor(root,
                root.left.right, root.left).val);
    }

}
