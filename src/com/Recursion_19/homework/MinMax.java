package com.Recursion_19.homework;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, -8};
        minMax(arr, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
    }

    static void minMax(int[] arr, int min, int max, int index) {
        if (index == arr.length) {
            System.out.println("Min:" + min);
            System.out.println("Max:" + max);
            return;
        }
        max = Math.max(arr[index], max);
        min = Math.min(arr[index], min);
        minMax(arr, min, max, index + 1);
    }
}
