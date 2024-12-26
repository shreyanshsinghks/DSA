package com.Recursion_19.aditya_verma;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> sc = new Stack<>();
        sc.push(0);
        sc.push(1);
        sc.push(5);
        sc.push(2);
        System.out.println(sc);
        customSort(sc);
        System.out.println(sc);
    }

    private static void customSort(Stack<Integer> sc) {
        if (sc.isEmpty()) {
            return;
        }
        int temp = sc.pop();
        customSort(sc);
        customInsert(sc, temp);
    }

    private static void customInsert(Stack<Integer> sc, int temp) {
        if (sc.isEmpty() || sc.peek() <= temp) {
            sc.push(temp);
            return;
        }

        int last = sc.pop();
        customInsert(sc, temp);
        sc.push(last);
    }
}
