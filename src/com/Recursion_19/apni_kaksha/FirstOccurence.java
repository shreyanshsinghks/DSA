package com.Recursion_19.apni_kaksha;

public class FirstOccurence {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 35, 6};
        System.out.println(
                firstOccurrenceInArray(arr, 54, 0)
        );
    }

    public static int firstOccurrenceInArray(int[] arr, int n, int i) {
        if (arr.length == i) {
            return -1;
        }
        if (arr[i] == n) {
            return i;
        }
        return firstOccurrenceInArray(arr, n, i + 1);
    }
}
