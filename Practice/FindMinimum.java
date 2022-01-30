import java.io.*;
import java.util.*;

public class FindMinimum {
	public static void main(String[] args) {
		
		int[] nums = {4,5,6,7,0,1,2,3};
		int[] nums2 = {2,0,1};
		System.out.println(findMin(nums2));
	}

	 public static int findMin(int[] nums) {
        
        int start = 0;
        int end = nums.length-1;

        if (nums[0]<=nums[end]) {
        	return nums[0];//in this case the array is not rotated because
        	// the first value is the lowest value in the given array
        }

        while(start<end){

        	int mid = start+(end-start)/2;
        	if (mid == end-1) {
        		return nums[mid];
        	}
        	if (nums[mid]>nums[mid+1]) {
        		return nums[mid+1];
        	}
        	else if (nums[mid]<nums[mid-1]) {
        		return nums[mid];
        	}
        	if (nums[start]<nums[mid]) {
        		start = mid+1;
        	}else if (nums[start]>nums[mid]) {
        		end = mid-1;
        	}
        }

        return -1;
    }
}
