package com.Arrays_13;

public class MaxSubarrayUsingPrefixArray {

    public static void printMaxSubarray(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        // Calculate the prefix sum array
        for (int k = 1; k < prefix.length; k++) {
            prefix[k] = arr[k] + prefix[k - 1];
        }

        // Iterate over all possible subarrays
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        printMaxSubarray(arr);
    }
}