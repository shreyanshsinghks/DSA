package com.Bitwise_17;

public class CheckNumberIsPowerTwo {
    public static void main(String[] args) {
        System.out.println(checkPowerTwo(3));
    }

    private static boolean checkPowerTwo(int n){
        return (n & (n-1)) == 0;
    }
}
