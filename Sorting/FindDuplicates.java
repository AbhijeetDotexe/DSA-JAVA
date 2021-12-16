package com.abhijeet.Sorting;

public class FindDuplicates {
    public static void main(String[] args) {

        int[] arr = {1,3,4,2,5,6,7,7};
        int ans = findDuplicates(arr);
        System.out.println(ans);

    }

    static int findDuplicates(int[] arr){
        int i = 0;
        while (i< arr.length){
            if (arr[i]!=i+1){
                int correctIndex = arr[i]-1;
                if (arr[i]!=arr[correctIndex]){
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                }else {
                    return arr[i];
                }
        }else {
                i++;
            }
        }
        return -1;
    }

}
