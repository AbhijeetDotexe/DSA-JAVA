package com.abhijeet.BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(CountRotation(arr));
    }

   static int CountRotation(int[] arr) {
        int pivot = findPivot(arr);
        return pivot+1;
   }

    //This will not work for duplicate values
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            // 4 Cases which can occur
            int mid = start+ (end-start)/2;
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]<=arr[start]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }

    //If there are duplicate elements in the array
    static int findDuplicatePivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            // 4 Cases which can occur
            int mid = start+ (end-start)/2;
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //if the elements at the middle,end and start are equal then skip at the duplicate elements
            if (arr[mid]==arr[start] && arr[mid]==arr[end]){
                //skip the duplicates
                //It may be possible that the element at the end and start are the pivots
                //We have to check the start and end value for the pivot element
                //check if the start is Pivot
                if (arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //check if the last element is the pivot
                if (arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in right side
            else if (arr[start]<arr[mid]||(arr[start]==arr[mid] && arr[mid]>arr[end])){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
