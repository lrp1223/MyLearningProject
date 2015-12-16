package com.rongpengli.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> lSet = new HashSet<Integer>();
        return happy(n, lSet);
    }

    public boolean happy(int n, Set<Integer> iSet) {
        int lNum = 0;
        while (n > 0) {
            lNum += (n % 10) * (n % 10);
            n = n / 10;
        }
        if (lNum == 1) {
            return true;
        } else if (iSet.contains(lNum)) {
            return false;
        } else {
            iSet.add(lNum);
            return happy(lNum, iSet);
        }
    }

    public static void main(String[] args) {
        HappyNumber lHappyNumber = new HappyNumber();
        System.out.println(lHappyNumber.isHappy(0));
    }
}
