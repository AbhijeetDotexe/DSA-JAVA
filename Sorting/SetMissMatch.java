package com.abhijeet.Sorting;
import java.util.Arrays;
//Find the Missing Number and Duplicate Number in the array which is form (0 to N)

public class SetMissMatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] a = setMissMatch(arr) ;
        System.out.println(Arrays.toString(a));
    }

    public static int[] setMissMatch(int[] arr){
        int i = 0;
        while (i< arr.length){
            int correctIndex = arr[i]-1;
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
            if (arr[index]!=index +1){
                return new int[]{arr[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }
}
