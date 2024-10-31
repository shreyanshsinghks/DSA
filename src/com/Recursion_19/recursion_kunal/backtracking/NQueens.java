package com.Recursion_19.recursion_kunal.backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 8;
        boolean[][] board = new boolean[n][n];
//        System.out.println(queens(board, 0));
        System.out.println(ownNQueen(board, 0));
    }


    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

//        Placing the queen and checking for every row and column
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
//        check for vertical
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

//        Check for left diagonal
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }


    private static int ownNQueen(boolean[][] board, int row){
        if (row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

//        Placing the queen
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafeMy(board, row, col)){
                board[row][col] = true;
                count += ownNQueen(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafeMy(boolean[][] board, int row, int col) {
//        checking for vertical
        for (int i = 0; i < row; i++) {
            if (board[row][i]){
                return false;
            }
        }

//        Checking for right side
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 0; i <= maxRight; i++) {
            if (board[row - i][col + i]){
                return false;
            }
        }

//        Checking for the left side
        int maxLeft = Math.min(row, col);
        for (int i = 0; i <= maxLeft; i++) {
            if(board[row - i][col - i]){
                return false;
            }
        }
        return true;
    }

}
