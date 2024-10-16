package com.binary_search_kunal;

public class Floor_of_number_by_binary_search {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(floor(arr, 1));
    }


    public static int floor(int[] arr, int target) {
        if(target < arr[0]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return target;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[end];
    }
}
