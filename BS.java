package com.abhijeet.Recursion.Basic;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,55,76,77,98,102};
        int target = 771;
        System.out.println(binarySearch(arr,target,0, arr.length-1));
    }

    static int binarySearch(int[] arr, int target, int s, int e ){
        if (s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if (arr[mid] == target){
            return mid;
        }
        if (target<arr[mid]){
            return binarySearch(arr,target,s,mid-1);
        }
        return binarySearch(arr,target,mid+1,e);
    }
}
