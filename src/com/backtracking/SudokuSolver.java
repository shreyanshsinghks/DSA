package com.backtracking;

public class SudokuSolver {
    public static void main(String[] args) {

    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        // this is how we are replacing the r,c from arguments
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            // if you found some empty element in row, then break
            if (!emptyLeft) {
                break;
            }
        }

        if (emptyLeft) {
            return true;
            // sudoku is solved
        }

        // backtrack
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    // found the answer
                    return true;
                } else {
                    // backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }


    static boolean isSafe(int[][] board, int row, int col, int num){
//        Check the row
        for (int i = 0; i < board.length; i++) {
            if(board[row][col] == num) return false;
        }

//        Check for column
        for (int[] nums: board) {
            if(nums[col] == num) return false;
        }

//        Check for box
        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if(board[row][col] == num) return false;
            }
        }
        return true;
    }
}
