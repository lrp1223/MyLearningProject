package com.rongpengli.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

public class SumRoottoLeafNumbers {
    public int sumNumbers(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root != null) {
            depthFirst(0, result, root);
        }

        int sum = 0;
        for (int value : result) {
            sum += value;
        }
        return sum;
    }

    private void depthFirst(int sum, List<Integer> result, TreeNode root) {
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            result.add(sum);
        } else {
            if (root.left != null) {
                depthFirst(sum, result, root.left);
            }
            if (root.right != null) {
                depthFirst(sum, result, root.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(5);

        SumRoottoLeafNumbers lSumRoottoLeafNumbers = new SumRoottoLeafNumbers();
        System.out.println(lSumRoottoLeafNumbers.sumNumbers(root));
    }

}
