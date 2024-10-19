package com.Recursion_19.recursion_kunal.string;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
//        pad("", "12");
        List<String> ans = padList("", "12");
        System.out.println(ans);
        System.out.println(padCount("", "12"));
    }


    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static List<String> padList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(padList(p + ch, up.substring(1)));
        }
        return ans;
    }

    static int padCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count += padCount(p + ch, up.substring(1));
        }
        return count;
    }


}
