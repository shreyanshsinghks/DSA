package com.LeetCode.Recursion;

import java.util.ArrayList;

public class PerfectSquare {

    public static void main(String[] args) {
        ArrayList<Integer> perfectSquares = new ArrayList<>();
        perfectSquareTillN(perfectSquares, 12); // Precompute perfect squares less than or equal to n
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> finalAns = new ArrayList<>();
        perfectSquare(ans, finalAns, perfectSquares, 12, 0);
        System.out.println(finalAns); // Output the least number of perfect squares
    }

    private static void perfectSquare(ArrayList<Integer> ans, ArrayList<Integer> finalAns,
                                      ArrayList<Integer> perfectSquares, int n, int sum) {
        if (sum > n) {
            return; // Stop exploring if the current sum exceeds the target
        }

        if (sum == n) {
            // Check if this is the shortest combination
            if (finalAns.isEmpty() || ans.size() < finalAns.size()) {
                finalAns.clear();
                finalAns.addAll(new ArrayList<>(ans));
            }
            return;
        }

        // Iterate through the perfect squares
        for (int j = 0; j < perfectSquares.size(); j++) {
            int curr = perfectSquares.get(j);
            if (!ans.isEmpty() && curr > ans.get(ans.size() - 1)) {
                continue; // Ensure numbers are added in non-decreasing order to avoid duplicate combinations
            }
            ans.add(curr); // Add current perfect square
            perfectSquare(ans, finalAns, perfectSquares, n, sum + curr); // Explore further
            ans.remove(ans.size() - 1); // Backtrack
        }
    }

    private static void perfectSquareTillN(ArrayList<Integer> ans, int n) {
        // Generate all perfect squares less than or equal to n
        for (int i = 1; i * i <= n; i++) {
            ans.add(i * i);
        }
    }
}
