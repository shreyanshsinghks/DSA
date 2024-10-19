package com.binary_search_kunal.homework;

public class Geekonaki {
    public static void main(String[] args) {
        System.out.println(printGeekonaaki(1,3,2,5));
    }

    static int printGeekonaaki(int a, int b, int c, int n){
        if(n == 1) return a;
        if(n == 2) return b;
        if(n == 3) return c;
        return printGeekonaaki(a, b, c,n - 1) + printGeekonaaki(a, b, c,n - 2) + printGeekonaaki(a, b, c,n - 3);
    }
}