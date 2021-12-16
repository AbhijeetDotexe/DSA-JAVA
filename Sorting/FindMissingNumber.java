package com.abhijeet.Sorting;

import java.util.Arrays;

class MissingNumber{

    public int missingNumber(int[] arr){
        int i = 0;
        while (i< arr.length){
            int correctIndex = arr[i];
            if (arr[i]< arr.length && arr[i]!=arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else {
                i++;
            }
        }
        //Search for first Missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index){
                return index;
            }
        }
        return arr.length;
        }

    }

public class FindMissingNumber  {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        MissingNumber m = new MissingNumber();
        int ans = m.missingNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The Missing Number int the array is: "+ans);

    }
}
