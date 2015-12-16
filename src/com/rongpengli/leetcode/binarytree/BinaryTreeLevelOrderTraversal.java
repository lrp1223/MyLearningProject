package com.rongpengli.leetcode.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    // a bit complex, mine own
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root != null) {
            Queue<TreeNode> lQueue = new LinkedList<TreeNode>();
            lQueue.add(root);
            TreeNode lHeadNode;
            int current = 1, exsit;
            while (!lQueue.isEmpty()) {
                List<Integer> lll = new ArrayList<Integer>();
                exsit = current;
                for (int i = 0; i < current; i++) {
                    lHeadNode = lQueue.remove();
                    if (lHeadNode == null) {
                        exsit--;
                    } else {
                        lll.add(lHeadNode.val);
                        lQueue.add(lHeadNode.left);
                        lQueue.add(lHeadNode.right);
                    }
                }
                current = 2 * exsit;
                if (lll.size() > 0) {
                    result.add(lll);
                }
            }
        }

        return result;
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root != null) {
            Queue<TreeNode> lQueue = new LinkedList<TreeNode>();
            lQueue.add(root);
            while (!lQueue.isEmpty()) {
                int size = lQueue.size();
                List<Integer> lll = new ArrayList<Integer>();
                result.add(lll);
                for (int i = 0; i < size; i++) {
                    TreeNode lNode = lQueue.remove();
                    lll.add(lNode.val);
                    if (lNode.left != null) {
                        lQueue.add(lNode.left);
                    }
                    if (lNode.right != null) {
                        lQueue.add(lNode.right);
                    }
                }
            }
        }

        return result;
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root != null) {
            Queue<TreeNode> lQueue = new LinkedList<TreeNode>();
            lQueue.add(root);
            TreeNode lHeadNode;
            int current = 1, exsit;
            while (!lQueue.isEmpty()) {
                List<Integer> lll = new ArrayList<Integer>();
                exsit = current;
                for (int i = 0; i < current; i++) {
                    lHeadNode = lQueue.remove();
                    if (lHeadNode == null) {
                        exsit--;
                    } else {
                        lll.add(lHeadNode.val);
                        lQueue.add(lHeadNode.left);
                        lQueue.add(lHeadNode.right);
                    }
                }
                current = 2 * exsit;
                if (lll.size() > 0) {
                    result.add(0, lll);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal lBinaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<List<Integer>> result = lBinaryTreeLevelOrderTraversal.levelOrder2(root);

        List<List<Integer>> result2 = lBinaryTreeLevelOrderTraversal.levelOrderBottom(root);
    }

}
