package com.backtracking.backtracking_ApnaCollege;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] sudoku = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (sudokuSolver(sudoku, 0, 0)) {
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists.");
        }
    }

    private static boolean sudokuSolver(int[][] sudoku, int row, int col) {
        // Base condition: if row reaches 9, we've solved the puzzle
        if (row == 9) return true;

        int nextRow = row;
        int nextCol = col + 1;
        if (nextCol == 9) {
            nextRow += 1;
            nextCol = 0;
        }

        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }

        return false;
    }

    private static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit || sudoku[row][i] == digit) return false;
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sudoku[sr + i][sc + j] == digit) return false;
            }
        }
        return true;
    }

    private static void printSudoku(int[][] sudoku) {
        for (int[] row : sudoku) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
