package com.Recursion_19.recursion_kunal.sorting;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 6, 7, 9};
        System.out.println(search(arr, 9));
    }

    public static int search(int[] arr, int target) {
        return helper(arr, target, 0);
    }

    public static int helper(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return helper(arr, target, index + 1);
        }
    }
}
