package com.Arrays_13;

public class PrintSubarray {
    public static void printSubarray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += arr[k];
                    System.out.print(arr[k]);
                }
                System.out.println("   Sum = " + sum);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        printSubarray(arr);
    }
}
