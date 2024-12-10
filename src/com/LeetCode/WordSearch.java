package com.LeetCode;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'a', 'b', 'c', 'e'}, {'s', 'f', 'c', 's'}, {'a', 'd', 'e', 'e'}};
        boolean[][] visited = {
                {true, true, true, true},
                {true, true, true, true},
                {true, true, true, true}
        };
        String word = "seed";
        char targetChar = word.charAt(0);
        boolean found = false;
        for (int row = 0; row < board.length && !found; row++) {
            for (int col = 0; col < board[row].length && !found; col++) {
                if (board[row][col] == targetChar) {
                    found = wordSearch(board, visited, word, new StringBuilder(), row, col);
                }
            }
        }
        System.out.println(found);
    }

    private static boolean wordSearch(char[][] board, boolean[][] visited, String word, StringBuilder currAns, int row, int col) {
        if (currAns.toString().equals(word)) {
            return true; // Base case: Word is found
        }

        if (!isSafe(visited, row, col)) {
            return false; // Out of bounds or already visited
        }

        currAns.append(board[row][col]);
        visited[row][col] = false; // Mark as visited

        // Explore all 4 directions
        if (wordSearch(board, visited, word, currAns, row + 1, col) || // Down
                wordSearch(board, visited, word, currAns, row - 1, col) || // Up
                wordSearch(board, visited, word, currAns, row, col + 1) || // Right
                wordSearch(board, visited, word, currAns, row, col - 1)) { // Left
            return true; // If any direction finds the word, return true
        }
        // Backtrack
        visited[row][col] = true;
        currAns.deleteCharAt(currAns.length() - 1);
        return false; // Word not found
    }

    private static boolean isSafe(boolean[][] okBoard, int row, int col) {
        // Check boundaries and whether the cell is already visited
        if (row < 0 || row >= okBoard.length || col < 0 || col >= okBoard[row].length) {
            return false;
        }
        return okBoard[row][col];
    }
}
