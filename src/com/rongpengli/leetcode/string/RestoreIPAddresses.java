package com.rongpengli.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();
        int length = s.length();
        if (length <= 12 && length >= 4) {
            for (int i = 1; i <= 3; i++) {
                for (int j = 1; j <= 3; j++) {
                    if (i + j > length) {
                        break;
                    }
                    for (int k = 1; k <= 3; k++) {
                        if (i + j + k > length) {
                            break;
                        }
                        for (int l = 1; l <= 3; l++) {
                            if (i + j + k + l == length) {
                                String str1 = s.substring(0, i);
                                String str2 = s.substring(i, i + j);
                                String str3 = s.substring(i + j, i + j + k);
                                String str4 = s.substring(i + j + k);
                                if (str1.length() > 1 && str1.charAt(0) == '0' || str2.length() > 1
                                        && str2.charAt(0) == '0' || str3.length() > 1
                                        && str3.charAt(0) == '0' || str4.length() > 1
                                        && str4.charAt(0) == '0') {
                                    continue;
                                }
                                if (Integer.valueOf(str1) <= 255 && Integer.valueOf(str2) <= 255
                                        && Integer.valueOf(str3) <= 255
                                        && Integer.valueOf(str4) <= 255) {
                                    result.add(str1 + "." + str2 + "." + str3 + "." + str4);
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RestoreIPAddresses lRestoreIPAddresses = new RestoreIPAddresses();
        String lIP = "010010";
        List<String> result = lRestoreIPAddresses.restoreIpAddresses(lIP);
        for (String ip : result) {
            System.out.println(ip);
        }
    }

}
