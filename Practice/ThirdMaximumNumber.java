import java.io.*;
import java.util.*;

public class ThirdMaximumNumber {
	public static void main(String[] args) {
		
		int[] nums = {3,2,1};
		System.out.println(thirdMax(nums));
	}

	public static int thirdMax(int[] nums) {
        
        Arrays.sort(nums);
        int count = 1;
        int n = nums.length-1;
        int res = nums[n];
        while(count!=3 && n>=0){
        	if (nums[n]<res) {
        		res = nums[n];
        		count++;
        	}
        	n--;
        }
        return (count==3)? res: nums[nums.length-1];
    }
}