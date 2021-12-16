package com.abhijeet.Sorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5,6,7,4,1};
        List<Integer> c = findAllDuplicates(arr);
        System.out.println(c);
    }

    static List<Integer> findAllDuplicates(int[] arr){

        int i = 0;
        while(i< arr.length){
            int correctIndex = arr[i]-1;
            if (arr[i]!=arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else {
                i++;
            }
        }

        //Just find Missing Number
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length ; index++) {
            if (arr[index]!=index+1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }
}
