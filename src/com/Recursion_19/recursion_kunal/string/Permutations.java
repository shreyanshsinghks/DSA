package com.Recursion_19.recursion_kunal.string;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
//        permutation("", "abcd");
        List<String> str = permutationList("", "abc");
        System.out.println(str);
    }


    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutation(first + ch + second, up.substring(1));
        }
    }

    static ArrayList<String> permutationList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i);
            ans.addAll(permutationList(first + ch + second, up.substring(1)));
        }
        return ans;
    }
}
