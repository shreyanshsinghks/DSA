package com.binary_search_kunal.homework;

public class ProductUsingRecursion {
    public static void main(String[] args) {
        System.out.println(product(100,5));
    }

    static int product(int n1, int n2){
        if(n2 == 0) return 0;
        return n1 + product(n1, n2 - 1);
    }
}
