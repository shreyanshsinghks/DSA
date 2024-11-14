package com.backtracking.backtracking_ApnaCollege;

public class FindPermutations {
    public static void main(String[] args) {
        printPermutations("", "abc");
    }

    static void printPermutations(String ans, String up){
        if(up.isEmpty()){
            System.out.println(ans);
            return;
        }

        for (int j = 0; j < up.length(); j++) {
            printPermutations(ans + up.charAt(j), up.substring(0,j) + up.substring(j+1));
        }
    }
}
