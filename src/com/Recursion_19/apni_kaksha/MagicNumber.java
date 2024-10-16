package com.Recursion_19.apni_kaksha;

public class MagicNumber {

    public static void main(String[] args) {
        System.out.println(magicNumber(5));
    }

    public static int magicNumber(int n){
        int number = n;
        int ans = 0;
        int base = 5;
        while (number > 0){
            int last = number & 1;
            ans += last * base;
            number = number >> 1;
            base = base * 5;
        }
        return ans;
    }


}
