package com.rongpengli.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
    public List<String> binaryTreePaths(TreeNode1 root) {
        List<String> lPathList = new ArrayList<String>();
        if (root != null) {
            generatePath(root, "", lPathList);
        }
        return lPathList;
    }

    private void generatePath(TreeNode1 iNode, String iPath, List<String> iPathList) {
        String lPath = iPath;
        if (lPath.length() > 0) {
            lPath += "->";
        }
        lPath += iNode.val;

        if (iNode.left == null && iNode.right == null) {
            iPathList.add(lPath);
        } else {
            if (iNode.left != null) {
                generatePath(iNode.left, lPath, iPathList);
            }
            if (iNode.right != null) {
                generatePath(iNode.right, lPath, iPathList);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1);
        TreeNode1 left1 = new TreeNode1(2);
        TreeNode1 right1 = new TreeNode1(3);
        root.left = left1;
        root.right = right1;
        TreeNode1 right2 = new TreeNode1(5);
        left1.right = right2;

        BinaryTreePath lBinaryTreePath = new BinaryTreePath();
        List<String> lResult = lBinaryTreePath.binaryTreePaths(root);
        System.out.println(lResult);
    }
}

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    public TreeNode1(int x) {
        val = x;
    }
}
