package com.String_16;

public class capitalizeFirst {
    public static void main(String[] args) {
        String str = "hello how are you ";
        capitalizeTheFirstLetter(str);
    }

    static void capitalizeTheFirstLetter(String str){
        StringBuilder newStr = new StringBuilder();
//        Making first character capital
        newStr.append(Character.toUpperCase(str.charAt(0)));

//        Making character after space capital
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length() - 1){
                newStr.append(str.charAt(i));
                i++;
                newStr.append(Character.toUpperCase(str.charAt(i)));
            }else {
                newStr.append(str.charAt(i));
            }
        }
        System.out.println(newStr);
    }
}
