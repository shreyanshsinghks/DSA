package com.Recursion_19.recursion_kunal.string;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(mazeCount(3, 3));
//        System.out.println(mazePath("", 3, 3));
//        System.out.println(mazePathShort("", 3, 3));
        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        mazeWithRocks( "", maze, 0, 0);
    }

    static int mazeCount(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        int left = mazeCount(row - 1, col);
        int right = mazeCount(row, col - 1);
        return left + right;
    }

    static List<String> mazePath(String p, int row, int col) {
        if (row == 1 || col == 1) {
            List<String> str = new ArrayList<>();
            StringBuilder pBuilder = new StringBuilder(p);
            while (row > 1) {
                pBuilder.append("d");
                row--;
            }
            while (col > 1) {
                pBuilder.append("r");
                col--;
            }
            p = pBuilder.toString();
            str.add(p);
            return str;
        }
        List<String> left = mazePath(p + "d", row - 1, col);
        List<String> right = mazePath(p + "r", row, col - 1);
        List<String> ans = new ArrayList<>();
        ans.addAll(left);
        ans.addAll(right);
        return ans;
    }


    static List<String> mazePathShort(String p, int row, int col) {
        if (row == 1 && col == 1) {
            List<String> str = new ArrayList<>();
            str.add(p);
            return str;
        }
        List<String> ans = new ArrayList<>();
        if (row > 1) {
            List<String> left = mazePathShort(p + "D", row - 1, col);
            ans.addAll(left);
        }
        if (col > 1) {
            List<String> right = mazePathShort(p + "R", row, col - 1);
            ans.addAll(right);
        }
        return ans;
    }


    static void mazeWithRocks(String p, boolean[][] maze, int row, int col) {
//        We are starting from 0,0
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        if(row < maze.length - 1){
            mazeWithRocks(p + "D", maze, row + 1, col);
        }

        if (col < maze[0].length - 1){
            mazeWithRocks(p + "R", maze, row, col + 1);
        }
    }

}
