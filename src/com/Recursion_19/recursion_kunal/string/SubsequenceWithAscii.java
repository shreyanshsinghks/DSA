package com.Recursion_19.recursion_kunal.string;

import java.util.ArrayList;

public class SubsequenceWithAscii {
    public static void main(String[] args) {
        ArrayList<String> list = getWithAscii("", "abc");
        System.out.println(list);
    }


    static ArrayList<String> getWithAscii(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = getWithAscii(p, up.substring(1));
        ArrayList<String> second = getWithAscii(p + ch, up.substring(1));
        ArrayList<String> third = getWithAscii(p + (ch+0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
