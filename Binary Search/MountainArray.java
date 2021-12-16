package com.abhijeet.BinarySearch;
//Q- Find the Peak element in Mountain Array ?

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5,4,3,2,1};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
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

        return arr[start]; // u can also return end as both of them are the same value
    }
}
