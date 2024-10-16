package com.Recursion_19.apni_kaksha;

public class CheckSortedArray {

    public static void main(String[] args) {
        int[] arr = {1,2,9,5,6};
        System.out.println(checkSorted(arr, 0));

    }


    public static boolean checkSorted(int[] arr, int n){
        if(n == arr.length - 1){
            return true;
        }
        if(arr[n] > arr[n+1]){
            return false;
        }

        return checkSorted(arr, n + 1);
    }
}
