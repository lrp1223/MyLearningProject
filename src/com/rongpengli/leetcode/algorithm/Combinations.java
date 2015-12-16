package com.rongpengli.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combinations/
public class Combinations {
    public List<List<Integer>> combine1(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int[] nums = new int[n];
        combineHelper(0, 0, nums, n, k, result);
        return result;
    }

    public void combineHelper(int x, int size, int[] num, int n, int k, List<List<Integer>> result) {
        if (size > k || x > n) {
            return;
        }
        if (x == n) {
            if (size == k) {
                List<Integer> ll = new ArrayList<Integer>();
                for (int i = 0; i < num.length; i++) {
                    if (num[i] == 1) {
                        ll.add(i + 1);
                    }
                }
                result.add(ll);
            }
        } else {
            num[x] = 0;
            combineHelper(x + 1, size, num, n, k, result);
            num[x] = 1;
            combineHelper(x + 1, size + 1, num, n, k, result);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper(result, new ArrayList<Integer>(), 1, n, k);
        return result;
    }

    private void helper(List<List<Integer>> result, List<Integer> each, int pos, int n, int k) {
        if (each.size() > k) {
            return;
        }
        if (each.size() == k) {
            result.add(each);
        }
        for (int i = pos; i <= n; i++) {
            each.add(i);
            helper(result, new ArrayList<Integer>(each), i + 1, n, k);
            each.remove(each.size() - 1);
        }
    }

    public static void main(String[] args) {
        Combinations lCombinations = new Combinations();
        List<List<Integer>> result = lCombinations.combine(5, 3);
        for (List<Integer> ll : result) {
            for (Integer value : ll) {
                System.out.print(value);
            }
            System.out.println("");
        }
    }

}
