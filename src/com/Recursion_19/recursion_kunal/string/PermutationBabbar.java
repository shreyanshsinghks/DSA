package com.Recursion_19.recursion_kunal.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationBabbar {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        List<List<Integer>> ans = new ArrayList<>();

        givePermutations(nums, ans, 0);
        System.out.println(ans);
    }

    public static void givePermutations(List<Integer> arr, List<List<Integer>> ans, int index) {
        // Base case: if index is greater than or equal to arr size, add the current permutation to the result
        if (index >= arr.size()) {
            ans.add(new ArrayList<>(arr));
            return;
        }

        // Iterate over the remaining elements to generate all possible permutations
        for (int j = index; j < arr.size(); j++) {
            // Swap the current index with the loop variable to explore new permutations
            Collections.swap(arr, index, j);

            // Recursively call the function for the next index
            givePermutations(arr, ans, index + 1);

            // Backtrack by swapping back the elements
            Collections.swap(arr, index, j);
        }
    }
}
