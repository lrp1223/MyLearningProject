package com.rongpengli.leetcode.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SerializeDeserializeBinaryTree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }
        Queue<TreeNode> lQueue = new LinkedList<TreeNode>();
        lQueue.add(root);
        List<Integer> lTreeNodeList = new ArrayList<Integer>();
        while (!lQueue.isEmpty()) {
            TreeNode lHead = lQueue.remove();
            if (lHead == null) {
                lTreeNodeList.add(null);
            } else {
                lTreeNodeList.add(lHead.val);
                lQueue.add(lHead.left);
                lQueue.add(lHead.right);
            }
        }
        for (int i = lTreeNodeList.size() - 1; i >= 0; i--) {
            if (lTreeNodeList.get(i) == null) {
                lTreeNodeList.remove(i);
            } else {
                break;
            }
        }
        StringBuilder lStringBuilder = new StringBuilder("[");
        for (int i = 0; i < lTreeNodeList.size(); i++) {
            if (lTreeNodeList.get(i) != null) {
                lStringBuilder.append(lTreeNodeList.get(i));
            } else {
                lStringBuilder.append("null");
            }
            lStringBuilder.append(",");
        }
        lStringBuilder.replace(lStringBuilder.length() - 1, lStringBuilder.length(), "]");

        return lStringBuilder.toString();
    }

    public TreeNode deserialize(String data) {
        if (data == null) {
            return null;
        }
        String[] lNodeStr = data.replace("[", "").replace("]", "").split(",");
        if (lNodeStr.length == 1 && lNodeStr[0].equals("")) {
            return null;
        }
        Queue<TreeNode> lQueue1 = new LinkedList<TreeNode>();
        Queue<TreeNode> lQueue2 = new LinkedList<TreeNode>();
        for (int i = 0; i < lNodeStr.length; i++) {
            if (lNodeStr[i].equalsIgnoreCase("null")) {
                lQueue1.add(null);
            } else {
                lQueue1.add(new TreeNode(Integer.valueOf(lNodeStr[i])));
            }
        }
        TreeNode root = lQueue1.remove(), lHead1;
        lQueue2.add(root);
        while (lQueue1.size() > 1) {
            lHead1 = lQueue2.remove();
            lHead1.left = lQueue1.remove();
            if (lHead1.left != null) {
                lQueue2.add(lHead1.left);
            }
            lHead1.right = lQueue1.remove();
            if (lHead1.right != null) {
                lQueue2.add(lHead1.right);
            }
        }
        if (!lQueue1.isEmpty()) {
            lHead1 = lQueue2.remove();
            lHead1.left = lQueue1.remove();
        }
        return root;
    }

    public String serialize2(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helperS(root, sb);
        return sb.toString();
    }

    private void helperS(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("null").append(",");
            return;
        }

        sb.append(node.val).append(",");

        helperS(node.left, sb);
        helperS(node.right, sb);
    }

    public static void main(String[] args) {
        SerializeDeserializeBinaryTree lSerializeDeserializeBinaryTree = new SerializeDeserializeBinaryTree();
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(5);
        root.right.right.left = new TreeNode(6);
        System.out.println(lSerializeDeserializeBinaryTree.serialize(root));
        System.out.println(lSerializeDeserializeBinaryTree
                .serialize(lSerializeDeserializeBinaryTree
                        .deserialize("[0,1,3,2,null,null,5,null,null,6]")));
        System.out.println(lSerializeDeserializeBinaryTree.serialize2(root));
    }
}
