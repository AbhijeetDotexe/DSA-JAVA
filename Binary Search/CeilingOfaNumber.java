package com.abhijeet.BinarySearch;
//Q. Find the ceiling(Smallest or Nearest value) which is greater than or equal to the Target Number


public class CeilingOfaNumber {
    public static void main(String[] args) {
            int[] arr = {2,3,5,9,14,16,18};
            int target = 22;
            int ans = ceiling(arr,target);
        System.out.println(ans);
    }

    static int ceiling(int[]arr, int target){
        if (target>arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

//        for returning the number which is greater than the target Number if the target number is not present
//        we return the start value because it will point to the next number which is bigger than the
//        target number(it points to the next bigger value because it will break the while loop statement
//        (start<=end) because there is no such value)

        while(start<=end){
            int mid = start + (end-start)/2;
            if (target>arr[mid]){
                start = mid+1;
            }
            else if (target<arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return arr[start];

    }
}
