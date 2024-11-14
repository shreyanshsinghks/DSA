package com.LeetCode;

import java.util.ArrayList;

class AllPalindromicPartition {
    public static void main(String[] args) {
        ArrayList<String> currAns = new ArrayList<>();
        ArrayList<ArrayList<String>> allAns = new ArrayList<>();
        Palindromes("aabb", currAns, allAns);
        System.out.println(allAns);
    }

    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
        return null;
    }


    private static void Palindromes(String up, ArrayList<String> currAns, ArrayList<ArrayList<String>> allAns){
        if (up.isEmpty()){
            allAns.add(new ArrayList<>(currAns));
            return;
        }

        for (int i = 0; i < up.length(); i++) {
            if(isPalindrome(up.substring(0, i + 1))){
                currAns.add(up.substring(0, i + 1));
                Palindromes(up.substring(i + 1), currAns, allAns);
                currAns.removeLast();
            }
        }
    }

    private static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false; // A null or empty string isn't considered a palindrome
        }

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }
            left++;
            right--;
        }

        return true; // All characters matched, it's a palindrome
    }

}


