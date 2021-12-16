package com.abhijeet.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,6,2,3,1,8,7,9,4};
        int[] arr1 = {1,2,3,4,5,6,7,-21,-32,-4,-15,0};
        int[] c ={5,4,3,2,1};
        selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void selectionSort(int[] arr){
        //Find the maximum item in the remaining array and swap with correct index
        for (int i = 0; i < arr.length ; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static int getMaxIndex(int[] arr,int start, int end){
        int max = start;
        for (int i = start; i <=end ; i++) {
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second] = temp;
    }

}
