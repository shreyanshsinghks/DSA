package com.backtracking.backtracking_ApnaCollege;

public class GridWays {
    public static void main(String[] args) {
        int n = 3;
        boolean[][] board = new boolean[n][n];
        gridWays(board, 0, 0, "");
    }

    private static void gridWays(boolean[][] board, int row, int col, String ans) {
        // Base case: if we've reached the last cell, print the answer and return
        if(row == board.length - 1 && col == board[0].length - 1){
            System.out.println(ans);
            return;
        }

        // Move right if within bounds (col + 1 should be valid)
        if(col + 1 < board[0].length){
            gridWays(board, row, col + 1, ans + "R");
        }

        // Move down if within bounds (row + 1 should be valid)
        if(row + 1 < board.length){
            gridWays(board, row + 1, col, ans + "D");
        }
    }
}
