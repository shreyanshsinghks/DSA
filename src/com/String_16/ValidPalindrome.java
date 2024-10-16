package com.String_16;


public class ValidPalindrome {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        String st = "A man, a plan, a canal: Panama";
        for(int i = 0; i < st.length(); i++){
            if(Character.isLetterOrDigit(st.charAt(i))){
                str.append(Character.toLowerCase(st.charAt(i)));
            }
        }

        Boolean isPalindrome = true;
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println('s' - 'a');
    }
}