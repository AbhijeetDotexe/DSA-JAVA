import java.io.*;
import java.util.*;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {
	public static void main(String[] args) {
	
		int[] nums = {1,2,3,4};
		int[] nums1 = {-1,1,0,-3,3};
		System.out.println(Arrays.toString(productExceptSelf(nums1)));


	}

	public static int[] productExceptSelf(int[] nums){

			int[] answer = new int[nums.length];
			int product = 1;
			int zeroCount = 0;

			for (int i =0;i<nums.length ;i++ ) {
				answer[i] = 0;
			}


			//Calculating the product, skip to avoid multiplying by zero
			for (int num: nums)  {
				if (num == 0) {
					zeroCount++;
				}else {
					product = product * num;
				}
			}

			//if we have more than 1 zero the whole array willbe zero
			if (zeroCount > 1) {
				return answer;
			}


			for (int i = 0;i<nums.length ;i++ ) {
				if (nums[i]!=0 && zeroCount == 1) {
					answer[i] = 0;
				}else{
					answer[i] = nums[i] == 0 ?product : product/nums[i];
					//if number is zero then the product will be the answer because we cannot divide by 0
				}
			}

			return answer;
	}
}