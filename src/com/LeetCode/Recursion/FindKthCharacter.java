package com.LeetCode.Recursion;

class FindKthCharacter {

    public static void main(String[] args) {
        char ch = kthCharacter(2);
        System.out.println(ch);
    }

    public static char kthCharacter(int k) {
        String up = "a";
        StringBuilder p = new StringBuilder();
        while (p.length() < k + 1) {
            p.append(up);
            up = nextLetter("", p.toString());
        }
        return p.toString().charAt(k - 1);

    }

    public static String nextLetter(String p, String up) {
        if (up.isEmpty()) {
            return p;
        }
        char ch = (char) (up.charAt(0) + 1);
        return nextLetter(p + ch, up.substring(1));
    }
}