package com.Recursion_19.recursion_kunal.sorting;

import java.util.Arrays;

public class BubbleByRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubble(arr, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int len, int curr) {
        if (len == 1) {
            return;
        }
        if (curr < len - 1) {
            if (arr[curr] > arr[curr + 1]) {
                int temp = arr[curr];
                arr[curr] = arr[curr + 1];
                arr[curr + 1] = temp;
            }
            bubble(arr, len, curr + 1);
        } else {
            bubble(arr, len - 1, 0);
        }
    }
}
