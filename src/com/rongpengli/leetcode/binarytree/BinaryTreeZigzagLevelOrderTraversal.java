package com.rongpengli.leetcode.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root != null) {
            Queue<TreeNode> lQueue = new LinkedList<TreeNode>();
            lQueue.add(root);
            boolean backward = false;
            while (!lQueue.isEmpty()) {
                int size = lQueue.size();
                List<Integer> ll = new ArrayList<Integer>();
                result.add(ll);
                for (int i = 0; i < size; i++) {
                    TreeNode lTreeNode = lQueue.remove();
                    if (backward) {
                        ll.add(0, lTreeNode.val);
                    } else {
                        ll.add(lTreeNode.val);
                    }
                    if (lTreeNode.left != null) {
                        lQueue.add(lTreeNode.left);
                    }
                    if (lTreeNode.right != null) {
                        lQueue.add(lTreeNode.right);
                    }
                }
                backward = !backward;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(7);

        BinaryTreeZigzagLevelOrderTraversal lBinaryTreeZigzagLevelOrderTraversal = new BinaryTreeZigzagLevelOrderTraversal();
        List<List<Integer>> result = lBinaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root);

        for (List<Integer> ll : result) {
            for (Integer value : ll) {
                System.out.print(value);
                System.out.print("    ");
            }
            System.out.println();
        }
    }

}
