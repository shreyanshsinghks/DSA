package com.Recursion_19.apni_kaksha;

public class X_power_n_optimized {
    public static void main(String[] args) {
        System.out.println(givePower(2, 5));
    }

    public static int givePower(int x, int n) {
        if (n == 0) return 1;
        if (n % 2 == 0) {
            return givePower(x, n / 2) * givePower(x, n / 2);
        }
        return (int) (x * (Math.pow(givePower(x, (n - 1) / 2), 2)));
    }
}
