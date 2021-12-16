package com.abhijeet.BinarySearch;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        //int m = 2;
        System.out.println(splitArray(arr,2));
    }

    static int splitArray(int[]arr, int m){
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length ; i++) {
            start = Math.max(start,arr[i]);
            //in the end of the loop it will contain the maximum item from the array
            end+=arr[i];
        }

        //binary Search
        while (start<end){
            //try for the middle as the potential answer
            int mid = start+ (end-start)/2;

            //calculate in how many pieces can u divide this in with max sum
            int sum = 0;
            int pieces = 1;
            for (int num:arr){
                if (sum+num>mid){
                    //You cannot add this in the subArray, make a new one
                    //If u can add this in the subArray, then sum = num
                    sum = num;
                    pieces++;
                }else {
                    sum+=num;
                }
            }
            if (pieces>m){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return end ;//here start and end will be equal, so we can return start also
    }
}
