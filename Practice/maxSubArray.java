package com.abhijeet.Questions;

public class maxSubArray {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArrays(nums));
    }

    public static int maxSubArrays(int[] nums){

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length ; i++) {
            sum = sum < 0 ?nums[i] :(sum+nums[i]);
            max = Math.max(sum,max);
        }

        return max;
    }
}
