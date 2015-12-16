package com.rongpengli.leetcode.math;

public class RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area = (C - A) * (D - B) + (G - E) * (H - F);

        int bottomX = Math.max(A, E);
        int bottomY = Math.max(B, F);
        int topX = Math.min(C, G);
        int topY = Math.min(D, H);
        if (topX > bottomX && topY > bottomY) {
            area -= (topX - bottomX) * (topY - bottomY);
        }

        return area;
    }

    public static void main(String[] args) {
        RectangleArea lRectangleArea = new RectangleArea();
        System.out.println(lRectangleArea.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));

    }

}
