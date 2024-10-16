package com.Recursion_19.recursion_kunal.string;

import java.util.ArrayList;

public class Subsequence {

    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();
        subSequence("", "aeioqq", result);
        System.out.println(result);
    }

    static void subSeq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    static ArrayList<String> subSequence(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSequence(p + ch, up.substring(1));
        ArrayList<String> right = subSequence(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subSequence(String p, String up, ArrayList<String> list) {
        if (up.isEmpty()) {
            list.add(p);
            return;
        }

        char ch = up.charAt(0);

        // Include the current character in the subsequence
        subSequence(p + ch, up.substring(1), list);

        // Exclude the current character from the subsequence
        subSequence(p, up.substring(1), list);

    }
}
