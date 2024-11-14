package com.LeetCode;

import java.util.Arrays;
import java.util.List;

public class AdjacentIncreasingSubArray {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,9,2,3,4,3,1};
        List<Integer> nums = Arrays.asList(-3,-19,-8,-16);
        System.out.println(hasIncreasingSubarrays(nums, 3));
    }

    private static boolean hasIncreasingSubarrays(List<Integer> nums, int len) {
        int[] arr = listToArray(nums);
        if (arr.length < len) return false;
        int peak = peak(arr);

        if (peak - len + 1 < 0) return false;
        for (int i = peak - len + 1; i < peak - 1; i++) {
            if (arr[i] >= arr[i + 1]){
                return false;
            }
        }

        if (peak + len > arr.length) return false;
        for (int i = peak + 1; i < peak + len - 1; i++) {
            if (arr[i] >= arr[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static int[] listToArray(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
