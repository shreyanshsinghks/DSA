package com.LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinationSums {
    public static void main(String[] args) {
        List<Integer> currAns = new ArrayList<>();
        List<List<Integer>> finalAns = new ArrayList<>();
        int[] candidates = {2,3,6,7};
        giveCombination(candidates, 7, 0, currAns, finalAns);
        System.out.println(finalAns);
    }

    private static void giveCombination(int[] candidates, int target, int index, List<Integer> currAns, List<List<Integer>> finalAns) {
        if (target == 0) {
            finalAns.add(new ArrayList<>(currAns));
            return;
        }
        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            currAns.add(candidates[i]);
            giveCombination(candidates, target - candidates[i], i, currAns, finalAns);
            currAns.remove(currAns.size() - 1);
        }
    }
}

