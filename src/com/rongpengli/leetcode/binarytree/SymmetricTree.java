package com.rongpengli.leetcode.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public boolean isSymmetric1(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);

    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else {
            return left.val == right.val && isSymmetric(left.left, right.right)
                    && isSymmetric(left.right, right.left);
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> lQueue1 = new LinkedList<TreeNode>();
        Queue<TreeNode> lQueue2 = new LinkedList<TreeNode>();
        lQueue1.add(root);
        lQueue2.add(root);

        while (!lQueue1.isEmpty()) {
            if (lQueue2.isEmpty()) {
                return false;
            }
            TreeNode node1 = lQueue1.remove();
            TreeNode node2 = lQueue2.remove();
            if (node1 == null && node2 == null) {
                continue;
            } else if (node1 == null || node2 == null) {
                return false;
            } else if (node1.val != node2.val) {
                return false;
            } else {
                lQueue1.add(node1.left);
                lQueue1.add(node1.right);
                lQueue2.add(node2.right);
                lQueue2.add(node2.left);
            }

        }
        if (!lQueue2.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SymmetricTree lSymmetricTree = new SymmetricTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(lSymmetricTree.isSymmetric1(root));
        System.out.println(lSymmetricTree.isSymmetric(root));
    }

}
