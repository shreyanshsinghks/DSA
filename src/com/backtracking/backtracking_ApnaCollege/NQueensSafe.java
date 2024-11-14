package com.backtracking.backtracking_ApnaCollege;

public class NQueensSafe {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        nQueensSafe(board, 0);
    }


    static void nQueensSafe(boolean[][] board, int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                nQueensSafe(board, row + 1);
                board[row][col] = false;
            }
        }
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
//        for vertical
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

//        for diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }

//        for diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }

        return true;
    }

    private static void printBoard(boolean[][] board) {
        for (boolean[] chars : board) {
            for (int j = 0; j < board.length; j++) {
                if (chars[j]) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println("----------------------");
    }


}
