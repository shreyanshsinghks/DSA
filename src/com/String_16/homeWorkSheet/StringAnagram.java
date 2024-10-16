package com.String_16.homeWorkSheet;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("gum", "mug"));
    }

    private static boolean isAnagram(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        if(str1.length() != str2.length()){
            return false;
        }
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}
