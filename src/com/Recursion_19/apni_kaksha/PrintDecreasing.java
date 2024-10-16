package com.Recursion_19.apni_kaksha;

public class PrintDecreasing {

    public static void main(String[] args) {
        printNumbers(10);
    }

    public static void printNumbers(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printNumbers(n-1);
    }
}
