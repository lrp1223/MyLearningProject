package com.rongpengli.leetcode;

import java.util.ArrayList;
import java.util.List;

class ListNode1 {
	int val;
	ListNode1 next;

	ListNode1(int x) {
		val = x;
	}
}

public class ACM {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> lResult = new ArrayList<List<Integer>>();
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		if (numRows >= 2) {
			List<Integer> l2 = new ArrayList<Integer>();
			l2.add(1);
			l2.add(1);

			lResult.add(l1);
			lResult.add(l2);
			for (int i = 2; i < numRows; i++) {
				List<Integer> lList = new ArrayList<Integer>();
				lList.add(1);
				List<Integer> lPrevious = lResult.get(i - 1);
				for (int j = 1; j < i; j++) {
					lList.add(lPrevious.get(j - 1) + lPrevious.get(j));
				}
				lList.add(1);
				lResult.add(lList);
			}
		} else if (numRows == 1) {
			lResult.add(l1);
		}
		return lResult;
	}

	public static void main(String[] args) {
		System.out.println(generate(0));
	}
}
