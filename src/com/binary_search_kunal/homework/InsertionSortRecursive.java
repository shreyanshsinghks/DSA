package com.binary_search_kunal.homework;

import java.util.Arrays;

public class InsertionSortRecursive {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr, int start) {
        if (start == arr.length) return;
        int min = start;
        for (int i = start; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        int temp = arr[start];
        arr[start] = arr[min];
        arr[min] = temp;
        insertionSort(arr, start + 1);
    }
}
