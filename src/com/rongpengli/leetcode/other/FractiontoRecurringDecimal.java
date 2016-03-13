package com.rongpengli.leetcode.other;

import java.util.HashMap;
import java.util.Map;

public class FractiontoRecurringDecimal {
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder result = new StringBuilder();
        result.append(numerator / denominator);
        if (numerator % denominator != 0) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            StringBuilder strBuilder = new StringBuilder();
            numerator = numerator % denominator;
            int index = 0, val;
            while (numerator != 0) {
                numerator *= 10;
                val = numerator / denominator;
                if (val > 0) {
                    if (map.containsValue(val)) {

                    }

                    map.put(index, val);
                    strBuilder.append(val);
                    numerator %= numerator;
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        FractiontoRecurringDecimal lFractiontoRecurringDecimal = new FractiontoRecurringDecimal();
        System.out.println(lFractiontoRecurringDecimal.fractionToDecimal(20, 3));
    }
}
