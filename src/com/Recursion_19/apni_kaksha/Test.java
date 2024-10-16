package com.Recursion_19.apni_kaksha;

public class Test {
    public static void main(String[] args) {
        System.out.println(calculateSetBits(4));
    }


    public static int calculateSetBits(int n){
        int counter = 0;

        while(n > 0){
            n = n & (n - 1);
            counter++;
        }

        return counter;
    }
}
