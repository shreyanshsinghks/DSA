package com.backtracking.backtracking_ApnaCollege;

public class FindSubsets {
    public static void main(String[] args) {
        findSubsets("", "abc", 0);
    }

    static void findSubsets(String ans, String str, int i){
//        base case
        if(i == str.length()){
            if(ans.isEmpty()){
                System.out.println("null");
                return;
            }
            System.out.println(ans);
            return;
        }

//        Recursion
//        taken
        findSubsets(ans + str.charAt(i), str, i + 1);

//        if not taken
        findSubsets(ans, str, i + 1);
    }
}
