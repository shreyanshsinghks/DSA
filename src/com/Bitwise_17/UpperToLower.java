package com.Bitwise_17;

public class UpperToLower {

    public static void main(String[] args) {
        printLower();
    }

    public static void printLower(){
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print((char)(ch | ' '));
        }
    }

}
