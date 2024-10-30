package com.Recursion_19.recursion_kunal.string;

public class Sample {
    public static void main(String[] args) {

        System.out.println(lengthAfterTransformations("azbk", 1));
    }


    static int lengthAfterTransformations(String s, int t) {
        String ans = s;
        for(int i = 0; i < t; i++){
            ans = transform(ans);
        }
        return ans.length();
    }

    static String transform(String s){
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 122){
                ans.append("ab");
            } else{
                ch++;
                ans.append(ch);
            }
        }
        return ans.toString();
    }




}
