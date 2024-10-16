package com.Recursion_19.apni_kaksha;

public class NthFibonacciNumber {

    public static void main(String[] args) {
        System.out.println(giveFibonacci(5));
    }

    
    public static int giveFibonacci(int n){
//        0,1,1,2,3,5,8,13
        if(n == 1){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        return giveFibonacci(n - 1) + giveFibonacci(n - 2);
    }
}
