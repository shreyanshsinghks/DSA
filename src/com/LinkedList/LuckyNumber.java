package com.LinkedList;

class LuckyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    private static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
            if (slow == 1 || fast == 1) return true;
        } while (slow != fast);
        return false;
    }

    private static int squareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int last = n % 10;
            sum += last * last;
            n /= 10;
        }
        return sum;
    }
}