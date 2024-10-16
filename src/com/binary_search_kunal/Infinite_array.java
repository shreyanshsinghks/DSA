package com.binary_search_kunal;


public class Infinite_array {
    public static void main(String[] args) {
    }

    public static int ans (int[] arr, int target){
        int start = 0;
        int end = 1;

        while (target < arr[end]){
            int tempStart = end + 1;
            end += (end - start + 1) * 2;
            start = tempStart;
        }
        return 0;
//        Now call binary search for start and end index and answer is given.

    }

}
