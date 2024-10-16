package com.Arrays_13;

public class MaxSubarrayKadanesAlgo {

    public static void MaxSubarrayKadanes(int[] arr) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            cs += arr[i];
            if(arr[i] < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Maximum sum is: " + ms);
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 4};
        MaxSubarrayKadanes(arr);
    }

}
