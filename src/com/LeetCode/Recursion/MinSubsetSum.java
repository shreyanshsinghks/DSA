package com.LeetCode.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MinSubsetSum {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(3, -2, 1, 4));
        System.out.println(subsetSum(nums, 1, 0, 1));

    }

//    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
//
//    }

    public static int subsetSum(List<Integer> nums, int ans, int currSum, int size) {
        if (currSum == 0) {
            currSum = Math.min(ans, currSum);
        }
        if (nums.size() <= size) {
            return -1;
        }

        List<Integer> left = new ArrayList<>(nums.subList(1, nums.size()));
        subsetSum(left, ans, currSum - nums.get(0), size);
        subsetSum(left, ans, currSum, size);
        return -1;
    }

}