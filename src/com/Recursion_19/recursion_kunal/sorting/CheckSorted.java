package com.Recursion_19.recursion_kunal;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(sorted(arr, 0));
    }

    static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}
