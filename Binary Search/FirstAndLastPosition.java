package com.abhijeet.BinarySearch;

//Given an array of integers nums sorted in ascending order, find the starting and ending position of the
//target element in the given array

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 5;
        int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        //Check the First Occurrence of the target first
        ans[0] = Search(nums,target,true);
        if (ans[0]!=-1) {
            ans[1] = Search(nums, target, false);
        }
        return ans;

    }

    //This function just returns the index value of the target
    static int Search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
            int start = 0;
            int end = nums.length-1;
            while (start<=end){

                int mid = start + (end-start)/2;
                if (target> nums[mid]){
                    start = mid +1;
                }else if(target<nums[mid]) {
                    end = mid-1;
                }else {
                    // potential answer found
                    ans = mid;
                    if (findStartIndex){
                        end = mid-1;
                    }else {
                        start=mid+1;
                    }

                }
            }
            return ans;
        }


}
