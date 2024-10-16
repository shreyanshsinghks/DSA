package com.Recursion_19.apni_kaksha;

public class FriendsPairing {

    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }

    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int fnm1 = friendsPairing(n-1);
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n - 1) * fnm2;

//        total ways remaining
        return fnm1 + pairWays;
    }
}
