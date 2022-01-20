package com.abhijeet.Questions;

public class MatrixDiagonalSum {

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat){

        int length = mat.length;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <length ; i++) {
            sum1+= mat[i][i];
            sum2+= mat[i][length-i-1];
        }
        if (length%2==1){
            sum2-= mat[length/2][length/2];
        }
        return sum1+sum2;
    }
}
