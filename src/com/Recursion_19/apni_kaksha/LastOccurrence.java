package com.Recursion_19.apni_kaksha;

public class LastOccurrence {

    public static void main(String[] args) {
        int[] arr = {1,2,23,3,5,2};
        System.out.println(findLastOccurrence(arr, 0, 2));
    }

    public static int findLastOccurrence(int[] arr, int i, int num){
        if(arr.length == i) {
            return -1;
        }

        int last = findLastOccurrence(arr, i+1, num);
        if(last == -1 && arr[i] == num){
            return i;
        }
        return last;
    }
}
