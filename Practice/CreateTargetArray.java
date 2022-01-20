package com.abhijeet.Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {

    public static void main(String[] args) {

        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index){

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            list.add(index[i],nums[i] );
        }

        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            target[i] = list.get(i);
        }

        return target;
        
    }
}
