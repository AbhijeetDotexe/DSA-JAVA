package com.abhijeet.Sorting;
import java.util.ArrayList;
import java.util.List;

public class FindAllMissing {
    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> c = findDisappearedNumbers(arr);
        System.out.println(c);
    }

    static List<Integer> findDisappearedNumbers(int[] arr){

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
                ans.add(index+1);
            }
        }
        return ans;
    }
}
