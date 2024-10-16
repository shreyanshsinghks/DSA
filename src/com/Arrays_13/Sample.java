package com.Arrays_13;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
//        System.out.println(sumDigits(14));
        int[] arr = {999,19,199};
        System.out.println(minElement(arr));
    }

    public static int minElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = sumDigits(arr[i]);
            arr[i] = sum;
        }
        Arrays.sort(arr);
        return arr[0];
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int last = n % 10;
            sum += last;
            n /= 10;
        }
        return sum;
    }
}
