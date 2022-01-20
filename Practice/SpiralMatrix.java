package com.abhijeet.Questions;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
//        spiralOrder(matrix);
    }

    public static ArrayList<Integer> spiralOrder(int[][] matrix){
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0;
        int down = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int dir = 0;
        while (top<=down && left<= right){
            if (dir == 0){
                for (int i = left; i <=right ; i++) {
                    list.add(matrix[top][i]);
                }
                top ++;
            }
            else if (dir == 1){
                for (int i = top; i <= down ; i++) {
                    list.add(matrix[i][right]);
                }
                right--;
            }
            else if (dir == 2){
                for (int i = right; i>=left ; i--) {
                    list.add(matrix[down][i]);
                }
                down --;
            }
            else if (dir == 3){
                for (int i = down; i>=top ; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
            dir = (dir+1) % 4;
        }

        return list;
    }
}
