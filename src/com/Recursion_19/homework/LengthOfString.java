package com.Recursion_19.homework;

public class LengthOfString {
    public static void main(String[] args) {
        System.out.println(countLength("GEEKSFORGEEKS", 0));
    }

    static int countLength(String str, int count){
        if(str.length() == 1) return ++count;
        return countLength(str.substring(1), ++count);
    }
}
