package com.Stack_and_Queue;

import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(2);
        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(4);
        queue.add(475);
        queue.add(7);
        queue.add(10);
        queue.remove();
        System.out.println(queue.peek());


        Deque<Integer> deque = new ArrayDeque<>();
    }
}
