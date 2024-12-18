package com.LeetCode.Recursion;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1,};
        int target = 3;
        System.out.println(findSum(arr, 0, 0, target));
    }


    private static int findSum(int[] arr, int currSum, int index, int target) {
        if (index == arr.length) {
            if (currSum == target) {
                return 1;
            }
            return 0;
        }
        int plus = findSum(arr, currSum + arr[index], index + 1, target);
        int minus = findSum(arr, currSum - arr[index], index + 1, target);

        return plus + minus;
    }
}
