package com.Recursion_19.apni_kaksha;

public class TilingProblem {

    public static void main(String[] args) {
        System.out.println(tiling(4));
    }

    public static int tiling(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int vertical = tiling(n-1);
        int horizontal = tiling(n-2);
        return vertical + horizontal;
    }

}
