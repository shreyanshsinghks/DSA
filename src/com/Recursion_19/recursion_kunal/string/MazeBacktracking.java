package com.Recursion_19.recursion_kunal.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MazeBacktracking {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        allPaths("", board, 0, 0);
        allPathPrint("", board, 0, 0, new int[board.length][board[0].length], 1);
    }

    static void allPaths(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze.length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[row][col]) {
            return;
        }

//        It means there is no obstacle, or we have not set it to zero therefore we are visiting it and making it zero
        maze[row][col] = false;

        if (row < maze.length - 1) {
            allPaths(p + "D", maze, row + 1, col);
        }
        if (col < maze[0].length - 1) {
            allPaths(p + "R", maze, row, col + 1);
        }
//        for moving upwards it should not be in the zeroth row
        if (row > 0) {
            allPaths(p + "U", maze, row - 1, col);
        }
//        for moving left the col should be greater than zero
        if (col > 0) {
            allPaths(p + "D", maze, row, col - 1);
        }

//        This line is where the function will be over
//        so before the function gets removed, also remove the changes that were made by that function in the 2D array
        maze[row][col] = true;
    }


    static void allPathPrint(String p, boolean[][] maze, int row, int col, int[][] path, int step) {
        if (row == maze.length - 1 && col == maze.length - 1) {
            path[row][col] = step;
            System.out.println(p);
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return;
        }

        if (!maze[row][col]) {
            return;
        }

//        It means there is no obstacle, or we have not set it to zero therefore we are visiting it and making it zero
        maze[row][col] = false;
        path[row][col] = step;

        if (row < maze.length - 1) {
            allPathPrint(p + "D", maze, row + 1, col, path, step + 1);
        }
        if (col < maze[0].length - 1) {
            allPathPrint(p + "R", maze, row, col + 1, path, step + 1);
        }
//        for moving upwards it should not be in the zeroth row
        if (row > 0) {
            allPathPrint(p + "U", maze, row - 1, col, path, step + 1);
        }
//        for moving left the col should be greater than zero
        if (col > 0) {
            allPathPrint(p + "D", maze, row, col - 1, path, step + 1);
        }

//        This line is where the function will be over
//        so before the function gets removed, also remove the changes that were made by that function in the 2D array
        maze[row][col] = true;
        path[row][col] = 0;

    }

}
