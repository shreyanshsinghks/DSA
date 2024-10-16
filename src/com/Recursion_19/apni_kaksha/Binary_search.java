package com.Recursion_19.apni_kaksha;

public class Binary_search {

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,6,27};
        Binary_search b1 = new Binary_search();
        int index = b1.search(arr, 27, 0, arr.length - 1);
        System.out.println(index);
    }

    int search(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }

        int mid = (s+e)/2;
        if(arr[mid] == target){
            return mid;
        }

        else if (target < arr[mid]){
            return search(arr, target, 0, mid - 1);
        }

        else {
            return search(arr, target, mid+1, e);
        }

    }
}
