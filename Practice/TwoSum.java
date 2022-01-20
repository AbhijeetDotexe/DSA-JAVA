package com.abhijeet.Questions;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target){

        try {
            for (int i = 0; i < nums.length ; i++) {
                for (int j = i+1; j < nums.length ; j++) {
                    if (nums[i]+nums[j] == target){
                        return new int[]{i,j};
                    }
                }

            }
        }catch (IllegalArgumentException e){
            System.out.println("No solution found");
        }
        return nums;
    }


// Same solution using hash maps
//    Map<Integer,Integer> visited = new HashMap();
//
//        for (int i = 0; i < nums.length; i++) {
//        int currentNumber = nums[i];
//
//        if (visited.containsKey(currentNumber)) {
//            int vistedIndex = visited.get(currentNumber);
//            return new int[] { vistedIndex, i};
//        }
//
//        visited.put(target - currentNumber, i);
//    }
//        return new int[] {};
}
