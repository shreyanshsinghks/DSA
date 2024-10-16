package com.Bitwise_17;

public class SetBitsInNumber {
    public static void main(String[] args) {

    }

    private static int countBits(int n){
        int count = 0;
        while (n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
