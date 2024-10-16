package com.String_16;

public class StringPalindrome {

    public static void main(String[] args) {
        String str = "madama";
        
        boolean isPalin = checkPalindrome(str);
        System.out.println(isPalin);
    }

    public static boolean checkPalindrome(String str){
        boolean isPalindrome = true;
        for(int i = 0; i < (str.length() - 1)/2; i++){
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

}
