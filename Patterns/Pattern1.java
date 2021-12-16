package com.abhijeet.Patterns;

public class Pattern1 {
    public static void main(String[] args) {

        //pattern1(5);
        //pattern2(5);
        //pattern3(5);
        //pattern4(5);
        //pattern5(5);
        //pattern6(5);
        pattern7(4);
    }

    static void pattern1(int n){
        for (int row = 0; row <n ; row++) {
            //for every row run the col
            for (int col = 0; col <row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = n; row >0 ; row--) {
            for (int col = row; col>0 ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 0; row <2 * n ; row++) {
            int totalColsInRow = row > n?2*n-row:row;
                for (int col = 0; col <totalColsInRow ; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        static void pattern5(int n){
        for (int row = 0; row <2 * n ; row++) {
            int totalColsInRow = row > n?2*n-row:row;
            int totalSpaces = n-totalColsInRow;
            for (int s = 0; s <totalSpaces ; s++) {
                System.out.print(" ");
            }
                for (int col = 0; col <totalColsInRow ; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        static void pattern6(int n){
            for (int row = 1; row <n ; row++) {

                for (int spaces = 0; spaces <n-row ; spaces++) {
                    System.out.print(" ");
                }
                for (int col = row; col >=1 ; col--) {
                    System.out.print(col);
                }
                for (int col = 2; col <=row ; col++) {
                    System.out.print(col);
                }
                System.out.println();
            }
        }

        static void pattern7(int n){
           int originalN = n;
           n = 2 * n ;
            for (int row = 0; row <n; row++) {
                for (int col = 0; col <n; col++) {
                    int atEveryIndex = originalN - Math.min(Math.min(row,col),Math.min(n-row,n-col)) ;
                    System.out.print(atEveryIndex+" ");
                }
                System.out.println();
            }
        }
}

