package com.Recursion_19.homework;

public class CheckPrimeRecursion {
    public static void main(String[] args) {
        System.out.println(checkPrime(11, 2));
    }

    static boolean checkPrime(int n, int check) {
        if (check == n) return true;
        if (n % check == 0) return false;
        return checkPrime(n, check + 1);
    }
}
