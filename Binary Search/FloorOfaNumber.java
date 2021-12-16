package com.abhijeet.BinarySearch;
//Q. Find the floor of a Number Greater than or equal to the Target Number


public class FloorOfaNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 14;
        int ans = floor(arr,target);
        System.out.println(ans);
    }

    static int floor(int[] arr, int target) {

//        for returning the number which is less than the target Number if the target number is not present
//        we return the end value because it will point to the previous number which is less than the
//        target number(it points to the previous bigger value because it will break the while loop statement
//        (start<=end) because there is no such value)
        if (target>arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return arr[end];

    }
}

