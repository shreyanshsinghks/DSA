package com.LeetCode;

public class ConsecutiveElements {
    public static void main(String[] args) {
        System.out.println(remove("aabb", ""));
    }


    private static String remove(String str, String ans) {
        // Base condition
        if (str.length() <= 1) {
            return ans + str;
        }

        if(str.charAt(0) == str.charAt(1)){
            return remove(str.substring(1), ans);
        }
        return remove(str.substring(1), ans + str.charAt(0));
    }
}
