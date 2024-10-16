package com.Recursion_19.apni_kaksha;

public class X_power_n {
    public static void main(String[] args) {
        System.out.println(calculatePower(3,2));
    }

    public static int calculatePower(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * calculatePower(x, n-1);
    }
}
