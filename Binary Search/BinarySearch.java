package com.abhijeet.BinarySearch;
// Binary Search Only Works in a sorted array
public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-18,-10,-4,2,3,5,7,9,12,15,17,};
        int Target = 12;
        int ans = binarySearch(arr,Target);
        System.out.println(ans);

    }

    // return the index if the element is present in the array
    // return -1 if the element is not present in the array
    static int binarySearch(int[] arr, int Target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            //we cannot use (start+end)/2 to find the middle value
            //because in some cases their sum will exceed the value of int data type
            //So we use a modified version of the same formula
            int mid = start +(end-start)/2;

            if (Target<arr[mid]){
                end = mid-1;
            }
            else if (Target>arr[mid]){
                start = mid+1;
            }else {
                //Answer found if this statement executes
                return mid;
            }
        }
        //if the element is not present in the array it will return -1
        return -1;
    }
}
