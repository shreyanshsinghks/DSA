package com.Recursion_19.recursion_kunal.string;

public class skip_a {
    public static void main(String[] args) {
        String str = "Helloaavi";
//        skip("", str);
        System.out.println(skip(str));
    }


    static void skip(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unProcessed.charAt(0);
        if (ch == 'a') {
            skip(processed, unProcessed.substring(1));
        } else {
            skip(processed + ch, unProcessed.substring(1));
        }
    }

    static String skip(String str) {
        if (str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);
        if (ch == 'a') {
            return skip(str.substring(1));
        } else {
            return ch + skip(str.substring(1));
        }
    }
}
