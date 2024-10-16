package com.Recursion_19.apni_kaksha;

public class SumOfNnaturalNumbers {

    public static void main(String[] args) {
        System.out.println(sumNatural(4));
    }


    public static int sumNatural(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumNatural(n - 1);
    }
}
