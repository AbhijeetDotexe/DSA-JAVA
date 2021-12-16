package com.abhijeet.Sorting;

public class FirstPositiveMissing {
    public static void main(String[] args) {

        int[] arr = {1,2,0};
        int[] a = {3,4,-1,1};
        int ans = firstPositive(a);
        System.out.println(ans);
    }

    static int firstPositive(int[] arr){
        int i = 0;
        while (i< arr.length){
            int correctIndex = arr[i]-1;
            if (arr[i]>0 && arr[i]<= arr.length && arr[i]!=arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else {
                i++;
            }
        }
        //Search for first Missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index + 1){
                return index+1;
            }
        }
        return arr.length+1;
    }
}
