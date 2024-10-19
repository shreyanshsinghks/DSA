package com.binary_search_kunal.homework;

public class SumOfNaturalNumbersRecursion {
    public static void main(String[] args) {
        System.out.println(sumNatural(5));
    }

    static int sumNatural(int n) {
        if (n == 1) return 1;
        return n + sumNatural(n - 1);
    }
}
