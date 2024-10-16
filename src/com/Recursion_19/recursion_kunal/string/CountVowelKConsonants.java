package com.Recursion_19.recursion_kunal.string;

import java.util.ArrayList;

class CountVowelKConsonants {
    public static void main(String[] args) {
        System.out.println(countOfSubstrings("ieaouqqieaouqq", 1));
    }

    public static int countOfSubstrings(String word, int k) {
        ArrayList<String> list = new ArrayList<>();
        subSequence("", word, list, k);

        // Corrected logic: Count valid substrings that have all vowels
        for (int i = 0; i < list.size(); i++) {
            String p = list.get(i);
            int[] arr = new int[6]; // a e i o u

            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == 'a') {
                    arr[0] = 1;
                } else if (p.charAt(j) == 'e') {
                    arr[1] = 1;
                } else if (p.charAt(j) == 'i') {
                    arr[2] = 1;
                } else if (p.charAt(j) == 'o') {
                    arr[3] = 1;
                } else if (p.charAt(j) == 'u') {
                    arr[4] = 1;
                } else{
                    arr[5] = 1;
                }
            }

            int sum = 0;
            for (int j : arr) {
                if (j == 1) sum++;
            }

            // Check if all vowels are present; if not, remove the substring from the list
            if (sum != 6) {
                list.remove(i); // This line can cause ConcurrentModificationException, fix below
                i--; // Adjust index after removal to prevent skipping elements
            }
        }

        return list.size();
    }

    static void subSequence(String p, String up, ArrayList<String> list, int n) {
        if (up.isEmpty()) {
            list.add(p);
            return;
        }
        char ch = up.charAt(0);
        subSequence(p + ch, up.substring(1), list, n);
        subSequence(p, up.substring(1), list, n);
    }
}
