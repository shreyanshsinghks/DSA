package com.TwoDArray_15;

public class DiagonalSum {

    public static void main(String[] args) {
        int[][] myNumbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        diagonalSum(myNumbers);
    }

    public static void diagonalSum(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i][i];
            if(i != arr.length - i - 1){
                sum += arr[i][arr.length - i - 1];
            }
        }
        System.out.println("Sum = " + sum);
    }

}
