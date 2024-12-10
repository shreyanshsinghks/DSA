package com.LeetCode;

import java.util.ArrayList;

public class AllPalindromicPartitionRe {

    public static void main(String[] args) {
        ArrayList<String> currAns = new ArrayList<>();
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        allPalindromic("geeks", currAns, ans, 0);
        System.out.println(ans);
    }

    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
        return new ArrayList<>();
    }

    private static void allPalindromic(String str, ArrayList<String> currAns, ArrayList<ArrayList<String>> ans, int index) {
        if (index == str.length()) {
            ans.add(new ArrayList<>(currAns));
            return;
        }

        for (int i = index; i < str.length(); i++) {
            if (isPalindrome(str.substring(index, i + 1))) {
                currAns.add(str.substring(index, i + 1));
                allPalindromic(str, currAns, ans, i + 1);
                currAns.remove(currAns.size() - 1);
            }
        }
    }


    private static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
