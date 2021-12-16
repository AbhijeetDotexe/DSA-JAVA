package com.abhijeet.Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,6,5,2,1,4};
        int[] ar = {5,6,2,3,1,8,7,9,4};
        int[] arr1 = {1,2,3,4,5,6,7,-21,-32,-4,-15,0};// will not work because they are not continuous numbers
        int[] c ={5,4,3,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while (i< arr.length){
            int correctIndex = arr[i]-1;
            if (arr[i]!=arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else {
                i++;
            }
        }
    }
}
