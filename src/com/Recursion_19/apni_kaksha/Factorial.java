package com.Recursion_19.apni_kaksha;

public class Factorial {
//    5! = 5*4*3*2*1

    public static void main(String[] args) {
        System.out.println(printFactorial(0));
    }


    public static int printFactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n * printFactorial(n - 1);
    }
}
