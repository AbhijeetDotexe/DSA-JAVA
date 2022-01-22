import java.io.*;
import java.util.*;
import java.util.Arrays;

public class FirstAndLast {
	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		int target = 6;
		System.out.println(Arrays.toString(searchRange(nums,target)));
	}



	 public static int[] searchRange(int[] nums, int target){
	 		if (binarySearch(nums, target)) {
	 			
	 			int rightIndex = helperFun(nums,target,true);
	 			int leftIndex = helperFun(nums,target,false);
	 			return new int[]{leftIndex, rightIndex};
	 		}
	 		return new int[]{-1,-1};
	 }

	 public static boolean binarySearch(int[] nums, int target){
	 	int s = 0;
	 	int e = nums.length-1;
	 	int m;

	 	while(s<=e){
	 		m = s + (e - s)/2;
	 		if (nums[m]>target) {
	 			e = m -1;
	 		}else if (nums[m]<target) {
	 			s = m + 1;
	 		}else{
	 			return true;
	 		}
	 	}
	 	return false;
	 }


	 //Check for left and right position
	 public static int helperFun(int[] nums,int target, boolean check){

	 	if (nums.length == 0) {
	 		return 0;
	 	}

	 	int s = 0;
	 	int e = nums.length-1;
	 	int m = -1;
	 	while(s <=e){
	 		m = s + (e -s )/2;
	 		if (nums[m]>target) {
	 			e = m -1;
	 		}else if (nums[m]< target) {
	 			s = m +1;
	 		}else if (check) {
	 			s = m+1;
	 		}else {
	 			e = m -1;
	 		}
	 	}
	 	if (check) {
	 		return e;
	 	}else{
	 		return s;
	 	}
	 } 
}

