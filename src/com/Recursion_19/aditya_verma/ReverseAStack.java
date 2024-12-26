package com.Recursion_19.aditya_verma;

import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> sc = new Stack<>();
        sc.push(5);
        sc.push(4);
        sc.push(3);
        sc.push(2);
        sc.push(1);
        System.out.println(sc);
        reverseStack(sc);
        System.out.println(sc);
    }


    private static void insertLast(Stack<Integer> sc, int elem) {
        if (sc.isEmpty()) {
            sc.push(elem);
            return;
        }

        int top = sc.pop();
        insertLast(sc, elem);
        sc.push(top);
    }


    private static void reverseStack(Stack<Integer> sc) {
        if (sc.size() == 1) {
            return;
        }

        int last = sc.pop();
        reverseStack(sc);
        insertLast(sc, last);
    }
}
