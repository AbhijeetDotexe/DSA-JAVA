package com.abhijeet;

public class LinearRange {
    public static void main(String[] args) {
        int[] nums = {23,45,31,87,25,11,9,22};
        int a = SearchRange(nums,25,0,4);
        System.out.println(a);
    }

    static int SearchRange(int[] arr,int Target,int start, int end){
        if (arr.length==0){
            System.out.println("There is no Array to Search in . ");
            return -1;
        }
        for (int i = start; i <=end ; i++) {
            int element = arr[i];
            if (element==Target){
                return i;
            }
        }
        return -1;
    }
}
