package com.rongpengli.leetcode.other;

public class BulbSwitcher {
    public int bulbSwitch(int n) {
        int val = (int) Math.sqrt(n);
        return val;
    }

    public static void main(String[] args) {
        BulbSwitcher lBulbSwitcher = new BulbSwitcher();
        System.out.println(lBulbSwitcher.bulbSwitch(17));
    }

}
