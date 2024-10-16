package com.Recursion_19.apni_kaksha;

public class PrintIncreasing {

    public static void main(String[] args) {
        increaseNumber(5);
    }

    public static void increaseNumber(int n){
        if(n <= 0){
            return;
        }
        increaseNumber(n - 1);
        System.out.println(n);
    }
}
