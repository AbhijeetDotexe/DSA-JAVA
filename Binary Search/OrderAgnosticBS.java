package com.abhijeet.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {

        int[] arr = {99,87,73,68,56,41,32,22,12,8,0,-4,-15,-99};
        int Target = -99;
        int ans = orderAgnosticBS(arr,Target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1 ;
        //We need to find whether the array is in asc or desc order
        boolean isAsc = arr[start]<arr[end];
        // This is simple Binary Search Nothing new
        while (start<=end){
            int mid = start+(end-start)/2;

            if (arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (target>arr[mid]){
                    start = mid+1;
                }
                else if (target<arr[mid]){ //There is no need to put the last if statement
                    end = mid -1;
                }
            }else {
                if (target<arr[mid]){
                    start = mid+1;
                }
                else if (target>arr[mid]){
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
