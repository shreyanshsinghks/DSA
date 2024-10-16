package com.TwoDArray_15;

public class SearchInSorted2DArray {

    public static void main(String[] args) {
        int[][] myNumbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        searchInSorted(myNumbers, 9);
    }

    public static void searchInSorted(int[][] arr, int key) {
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            if (key == arr[row][col]) {
                System.out.println("Key Found" + "(" + row + "," + col + ")");
                return;
            } else if (key > arr[row][col]) {
                row++;
            } else {
                col--;
            }
        }
    }

}
