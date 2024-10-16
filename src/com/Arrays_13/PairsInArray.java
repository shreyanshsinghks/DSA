package com.Arrays_13;

public class PairsInArray {
    public static void printPairs(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int current = arr[i];
            for (int j = i + 1; j < arr.length; j++){
                System.out.print("("+current+","+arr[j]+"),"+" ");
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        printPairs(arr);
    }


}
