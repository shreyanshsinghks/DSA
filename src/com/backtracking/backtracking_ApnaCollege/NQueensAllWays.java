package com.backtracking.backtracking_ApnaCollege;

public class NQueensAllWays {
    public static void main(String[] args) {
        int n = 2;
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
    }


    static void nQueens(char[][] board, int row){
        if (row == board.length){
            printBoard(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            board[row][col] = 'Q';
            nQueens(board, row + 1);
            board[row][col] = 'X';
        }
    }

    private static void printBoard(char[][] board) {
        for (char[] chars : board) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
    }
}
