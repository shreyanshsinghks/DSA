package com.LeetCode.Recursion;

public class find_kth_bit_in_nth_binary_search {
    public static void main(String[] args) {
        System.out.println(findKthBit(3, 1));
    }

    private static char findKthBit(int n, int k) {
        k--;
        String sn = getSN(n, "0");
        System.out.println(sn);
        return sn.charAt(k);
    }


    private static String getSN(int count, String sn) {
        if (count <= 1) return sn;
        String newSn = sn + "1" + rev(sn);
        return getSN(count - 1, newSn);
    }

    private static String rev(String snPrev) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < snPrev.length(); i++) {
            char curr = snPrev.charAt(i);
            if (curr == '1') {
                str.append('0');
            } else {
                str.append('1');
            }
        }
        str.reverse();
        return str.toString();
    }
}
