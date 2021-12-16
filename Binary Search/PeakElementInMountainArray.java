package com.abhijeet.BinarySearch;

public class PeakElementInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    static int search(int[]arr,int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if (firstTry!=-1){
            return firstTry;
        }
        //try to search in the second half
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }

    static int MountainSearch(int[] arr, int target,int start, int end){
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target>arr[mid]){
                start = mid+1;
            }else if (target<arr[mid]){
                end = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start + (end-start)/2;
            if (arr[mid]>arr[mid+1]){
//                you are in the desc part of the array, so we need to check the left side of the array
//                this is why end!=mid-1, because it might be possible that it is the answer
                end = mid;
            }else{
                // You are in the asc part of the array
                start = mid+1;//because we know mid+1 element>mid element
            }
        }
        //in the end start==end because of the two checks we made above
        //start and end are always trying to find the max element in the above two checks
        //hence when they are pointing to the same element that is the maximum element in the array

        return start; // u can also return end as both of them are the same value
    }

    static int orderAgnosticBS(int[] arr,int target,int start,int end){
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
