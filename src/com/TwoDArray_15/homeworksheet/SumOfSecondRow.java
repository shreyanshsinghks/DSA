package com.TwoDArray_15.homeworksheet;

public class SumOfSecondRow {
    public static void main(String[] args) {
        int[][] nums = {{1,4,9}, {11,4,3},{2,2,3}};
        giveSum(nums);
    }

    public static void giveSum(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr[1].length; i++){
            sum += arr[1][i];
        }

        System.out.println("Sum = " + sum);
    }
}
