package com.abhijeet.Basic;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAndArrayList {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array !");
        for (int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The element of the array is :");
//        System.out.println(arr[0]);
        for (int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

        System.out.println("2-D Array");
        int[][] ar = new int[3][3];
        System.out.println("Enter the elements in the 2d array : ");
        for (int i = 0; i < ar.length ; i++) {
            for (int j = 0; j < ar[i].length ; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements in the 2d array are : ");
        for(int[] e:ar){
            System.out.print(Arrays.toString(e));
        }
    }
}
