package com.Arrays_13;

public class MaxSubarray1 {
    public static void printMaxSubarray(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += arr[k];
                }
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        printMaxSubarray(arr);
    }
}
