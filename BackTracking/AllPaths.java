package com.abhijeet.BackTracking;

import java.util.Arrays;

public class AllPaths {

    public static void main(String[] args) {

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
//        allPaths("", board, 0, 0);
        allPathsPrint("", board, 0, 0, path ,1);
    }

    //Returning all possible paths
    static void allPaths(String p, boolean[][] maze, int r, int c){

        if (r == maze.length - 1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        if (r < maze.length - 1){
            allPaths(p + 'D', maze, r+1, c);
        }
        if (c < maze[0].length - 1){
            allPaths(p + 'R', maze, r, c+1);
        }
        if (r > 0){
            allPaths(p + 'U', maze, r -1 , c);
        }
        if (c > 0){
            allPaths(p + 'L', maze, r, c-1);
        }

        //This line is where the function was over
        //so before the function get removed, also remove the changes that were made by it
        maze[r][c] = true;
    }








    //Printing all the paths possible
    static void allPathsPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){

        if (r == maze.length - 1 && c == maze[0].length-1){
            path[r][c] = step;
            for (int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;

        }
        if (!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1){
            allPathsPrint(p + 'D', maze, r+1, c, path, step + 1);
        }
        if (c < maze[0].length - 1){
            allPathsPrint(p + 'R', maze, r, c+1, path, step + 1);
        }
        if (r > 0){
            allPathsPrint(p + 'U', maze, r -1 , c, path, step + 1);
        }
        if (c > 0){
            allPathsPrint(p + 'L', maze, r, c-1, path, step + 1);
        }

        //This line is where the function was over
        //so before the function get removed, also remove the changes that were made by it
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
