package com.abhijeet.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,6,2,3,1,8,7,9,4};
        int[] arr1 = {1,2,3,4,5,6,7,-21,-32,-4,-15,0};
        bubble(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length ; i++) {
             swapped = false;
            //After each step, the max item will come at last respective index
            for (int j = 1; j < arr.length-i ; j++) {
                //swap if the item is smaller than its previous item
                if (arr[j]<arr[j-1]){
                    int Temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= Temp;
                    swapped = true;
                }
            }
            //if u did not swap for a particular value of i that means the array is already sorted, hence stop the loop
            if (!swapped){ // !false = true
                break;
            }
        }
    }
}
