package com.Recursion_19.apni_kaksha;

public class PascalTriangle {

    public static void main(String[] args) {
        System.out.println(returnPascal(4));
    }


    public static int returnPascal(int n){
        return 1 << (n-1);
    }
}
