package com.abhijeet.BackTracking;

public class SudokuSolver {
    public static void main(String[] args) {

        int[][] board = new int[][]{
                
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}

        };

        if (solve(board)){
            System.out.println("Displaying Answer for the board .... ");
            System.out.println();
            display(board);
        }else {
            System.out.println("Cannot solve the board, OOPS!");
        }
    }

    static boolean solve(int[][] board){

        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyPlacesLeft = true;

        //This is how we are replacing the r,c from arguments
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < board.length ; j++) {
                if (board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyPlacesLeft = false;
                    break;
                }
            }

            //If you have found some empty elements in row, then break
            if (emptyPlacesLeft == false){
                break;
            }
        }
        if (emptyPlacesLeft == true){
            return true;
            //Sudoku is solved
        }

        //Backtracking
        for (int number = 1; number < 10 ; number++) {
                if (isSafe(board, row, col, number)){
                    board[row][col] = number;
                    if (solve(board)){
                        // found the answer
                        return true;
                    }else {
                        //Backtrack
                        board[row][col] = 0;
                    }
                }
        }
        return false;
    }

    static void display(int[][] board){
        for (int[] row: board){
            for (int num: row){
                System.out.print(num+ " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int num){

        //Check the row
        for (int i = 0; i < board.length ; i++) {
            //Check the number is in the row
            if (board[row][col] == num){
                return false;
            }
        }

        //Check the col
        for (int[] nums: board){
            //Check the number is in the col
            if (nums[col] == num){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r <rowStart + sqrt ; r++) {
            for (int c = colStart; c <colStart + sqrt ; c++) {
                if (board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
