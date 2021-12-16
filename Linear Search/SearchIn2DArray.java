package com.abhijeet;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr ={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {22,5,123}
        };
        int Target = 22;
        int[] ans = Search2D(arr,Target);
        int max = Max(arr);
        System.out.println(Arrays.toString(ans));

        System.out.println("The Maximum value in the 2D Array is :"+max);
    }

    static int[] Search2D(int[][] arr, int target) {
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,1};
    }

    static int Max(int[][] arr) {
        int ans = Integer.MIN_VALUE;
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if (arr[row][col] > ans){
                    ans = arr[row][col];
                }
            }
        }
        return ans;
    }
}
