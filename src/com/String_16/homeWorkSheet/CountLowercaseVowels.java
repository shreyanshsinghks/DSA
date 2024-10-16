package com.String_16.homeWorkSheet;

public class CountLowercaseVowels {
    public static void main(String[] args) {
        String hello = "Hello world ";
        System.out.println(vowelCount(hello));
    }

    private static int vowelCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}
