package com.rongpengli.leetcode.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        int total = 0;
        if (root != null) {
            Queue<TreeNode> lQueue = new LinkedList<TreeNode>();
            lQueue.add(root);
            while (!lQueue.isEmpty()) {
                TreeNode head = lQueue.remove();
                total++;
                if (head.left != null) {
                    lQueue.add(head.left);
                }
                if (head.right != null) {
                    lQueue.add(head.right);
                }

            }
        }
        return total;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        CountCompleteTreeNodes lCompleteTreeNodes = new CountCompleteTreeNodes();
        System.out.println(lCompleteTreeNodes.countNodes(root));
    }

}
