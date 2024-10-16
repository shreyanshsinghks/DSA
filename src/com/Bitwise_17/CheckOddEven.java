package com.Bitwise_17;

public class CheckOddEven {
    public static void main(String[] args) {
        System.out.println(isEven(5));
    }

    private static boolean isEven(int a){
        if((a & 1) == 1){
            return false;
        }
        return true;
    }
}
