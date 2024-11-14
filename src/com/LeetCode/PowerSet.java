package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PowerSet {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        printPower("", "abc", str);
        Collections.sort(str);
        System.out.println(str);
    }

    private static void printPower(String p, String up, ArrayList<String> arr) {
        if (up.isEmpty()) {
            if (!p.isEmpty()) {
                arr.add(p);
            }
            return;
        }
        printPower(p + up.charAt(0), up.substring(1), arr);
        printPower(p, up.substring(1), arr);
    }
}
