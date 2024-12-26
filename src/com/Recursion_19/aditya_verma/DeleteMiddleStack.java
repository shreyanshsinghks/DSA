package com.Recursion_19.aditya_verma;

import java.util.Stack;

public class DeleteMiddleStack {
    public static void main(String[] args) {
        Stack<Integer> sc = new Stack<>();
        sc.push(5);
        sc.push(4);
        sc.push(3);
        sc.push(2);
        sc.push(1);
        System.out.println(sc);
        delMiddle(sc, sc.size() / 2 + 1);
        System.out.println(sc);
    }

    private static void delMiddle(Stack<Integer> sc, int n) {
        if (n == 1) {
            sc.pop();
            return;
        }
        int last = sc.pop();
        delMiddle(sc, n - 1);
        sc.push(last);
    }

}
