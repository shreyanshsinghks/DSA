package com.LeetCode.Recursion;

public class GoodNumber {
    public static void main(String[] args) {
        System.out.println(checkGood(69));
    }

    private static boolean checkGood(long num) {
        String str = Long.toString(num);
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                if (str.charAt(i) == '0' || str.charAt(i) == '2' || str.charAt(i) == '4' || str.charAt(i) == '6' || str.charAt(i) == '8') {
                    continue;
                } else {
                    return false;
                }
            } else {
                if (str.charAt(i) == '1' || str.charAt(i) == '2' || str.charAt(i) == '3' || str.charAt(i) == '5' || str.charAt(i) == '7') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
