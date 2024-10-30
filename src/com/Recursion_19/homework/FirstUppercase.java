package com.Recursion_19.homework;

public class FirstUppercase {
    public static void main(String[] args) {
        char ch = firstUpper("hellgdo");
        System.out.println(ch);
    }


    static char firstUpper(String str) {
        int ch = str.charAt(0);
        if (ch >= 65 && ch <= 90) {
            return str.charAt(0);
        }
        if(str.length() == 1){
            return '-';
        }
        return firstUpper(str.substring(1));
    }
}
