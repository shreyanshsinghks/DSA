package com.binary_search_kunal.homework;

import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printTriangle(arr);
    }

    static void printTriangle(int[] arr) {
        if (arr.length == 0) return;
        int[] newArr = new int[arr.length - 1];
        sum(arr, newArr, 0);
        printTriangle(newArr);
        System.out.println(Arrays.toString(arr));
    }


    static void sum(int[] arr, int[] newArr, int i) {
        if (i >= newArr.length) return;
        newArr[i] = arr[i] + arr[i + 1];
        sum(arr, newArr, i + 1);
    }
}
