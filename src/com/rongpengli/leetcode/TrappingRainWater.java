package com.rongpengli.leetcode;

public class TrappingRainWater {

    // Time exceeded
    public int trap1(int[] height) {
        int total = 0, water = 0;
        for (int hei : height) {
            total += hei;
        }
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] >= height[max]) {
                for (int j = max; j < i; j++) {
                    height[j] = height[max];
                }
                max = i;
            } else {
                for (int j = max; j < i; j++) {
                    if (height[j] < height[i]) {
                        height[j] = height[i];
                    }
                }
            }
        }
        for (int i = 0; i < height.length; i++) {
            water += height[i];
        }
        water = water - total;
        return water;
    }

    public int trap(int[] height) {
        int total = 0, water = 0;
        for (int hei : height) {
            total += hei;
        }
        int start = 0, end = height.length - 1;
        for (int i = 1, j = height.length - 2; i <= j;) {
            if (height[start] < height[end]) {
                if (height[i] < height[start]) {
                    height[i] = height[start];
                } else {
                    start = i;
                }
                i++;
            } else {
                if (height[j] < height[end]) {
                    height[j] = height[end];
                } else {
                    end = j;
                }
                j--;
            }
        }
        for (int i = 0; i < height.length; i++) {
            water += height[i];
        }
        return water - total;
    }

    // Container water
    public int maxArea(int[] height) {
        int max = 0, value;
        for (int i = 0, j = height.length - 1; i < j;) {
            if (height[i] > height[j]) {
                value = (j - i) * height[j];
                j--;
            } else {
                value = (j - i) * height[i];
                i++;
            }
            if (max < value) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        TrappingRainWater lTrappingRainWater = new TrappingRainWater();
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.err.println(lTrappingRainWater.trap(height));
        System.out.println(lTrappingRainWater.maxArea(height));
    }

}
