package com.Recursion_19.apni_kaksha;

public class RemoveDuplicate {

    public static void main(String[] args) {
        helperDuplicate("appnnacollege");
    }

    public static void helperDuplicate(String str) {
        removeDuplicates(str, 0, new StringBuilder(), new boolean[26]);
    }


    public static void removeDuplicates(String str, int index, StringBuilder newString, boolean[] arr) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(index);
        if (arr[currentChar - 'a']) {
            removeDuplicates(str, index + 1, newString, arr);
        } else {
            arr[currentChar - 'a'] = true;
            removeDuplicates(str, index + 1, newString.append(currentChar), arr);
        }
    }
}
