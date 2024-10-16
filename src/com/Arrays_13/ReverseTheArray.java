package com.Arrays_13;

public class ReverseTheArray {
    public static void reverse(int[] numbers){
        int first = 0;
        int last = numbers.length - 1;
        while (first < last){
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        reverse(nums);
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
