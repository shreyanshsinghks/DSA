package com.TwoDArray_15.homeworksheet;

public class PrintNumberOf7 {

    public static void main(String[] args) {
        int[][] array = {{4,7,8}, {8,8,7}};
        print7(array);
    }

    public static void print7(int[][] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println("Number of 7 in the array = " + count);
    }

}
