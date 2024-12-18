package com.LeetCode.Recursion;

class kth_symbol_in_grammar {
    public static void main(String[] args) {
        String ans = giveRow(4, "0");
        char ch = ans.charAt(3);

    }


    public int kthGrammar(int n, int k) {
        return 1;
    }

    private static String giveRow(int n, String ans) {
        if (n <= 1) return ans;
        StringBuilder currAns = new StringBuilder();
        for (int i = 0; i < ans.length(); i++) {
            char curr = ans.charAt(i);
            if (curr == '0') {
                currAns.append("01");
            } else {
                currAns.append("10");
            }
        }
        return giveRow(n - 1, currAns.toString());
    }
}