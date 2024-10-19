package com.Recursion_19.recursion_kunal.string;

import java.util.ArrayList;

public class DiceThrow {
    public static void main(String[] args) {
//        diceThrow("", 4);
        System.out.println(dice("", 4));
    }

    static void diceThrow(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            diceThrow(p + i, target - i);
        }
    }


    static ArrayList<String> dice(String p, int target) {
        if (target == 0) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(dice(p + i, target - i));
        }
        return ans;
    }
}
