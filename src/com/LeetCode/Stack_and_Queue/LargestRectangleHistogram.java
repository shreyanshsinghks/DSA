package com.LeetCode.Stack_and_Queue;

import java.util.Stack;

public class LargestRectangleHistogram {
    public static void main(String[] args) {
        int[] heights = {2,4};
        int[] prevSm = prevSmaller(heights);
        int[] nextSm = nextSmaller(heights);
        int max = 0;
        for (int i = 0; i < prevSm.length; i++) {
            max = Math.max(max, (nextSm[i] - prevSm[i] - 1) * heights[i]);
        }
        System.out.println(max);
    }


    private static int[] prevSmaller(int[] heights) {
        int len = heights.length;
        int[] prevSm = new int[len];
        Stack<Integer> sc = new Stack<>();
        for (int i = 0; i < len; i++) {
            while (!sc.isEmpty() && (heights[sc.peek()] >= heights[i])) {
                sc.pop();
            }
            if (sc.isEmpty()) {
                prevSm[i] = -1;
            } else {
                prevSm[i] = sc.peek();
            }
            sc.push(i);
        }
        return prevSm;
    }

    private static int[] nextSmaller(int[] heights) {
        int len = heights.length;
        int[] nextSm = new int[len];
        Stack<Integer> sc = new Stack<>();
        for (int i = len - 1; i >= 0; i--) {
            while (!sc.isEmpty() && heights[sc.peek()] >= heights[i]) {
                sc.pop();
            }
            if (sc.isEmpty()) {
                nextSm[i] = len;
            } else {
                nextSm[i] = sc.peek();
            }
            sc.push(i);
        }
        return nextSm;
    }

}
