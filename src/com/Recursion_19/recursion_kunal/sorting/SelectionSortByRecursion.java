package com.Recursion_19.recursion_kunal.sorting;

public class SelectionSortByRecursion {

    public static void main(String[] args) {
    }

    static void selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
//        Iterating in the current row
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);
            } else {
                selection(arr, r, c + 1, max);
            }
        }
//        when 1 iteration is complete the largest element is at the last
        else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selection(arr, r - 1, 0, 0);
        }
    }
}
