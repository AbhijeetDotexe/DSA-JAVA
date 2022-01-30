import java.io.*;
import java.util.*;

public class MaxAppearing {
	public static void main(String[] args) {
		
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int candidate = nums[0];
        int count = 0;

        for (int i=1;i<n ;i++ ) {
        	
        	if (count == 0) {
        		candidate = nums[i];
        		count = 1;
        	}
        	else {
        		if (candidate == nums[i]) {
        			count++;
        		}else {
        			count--;
        		}
        	}
        }
        return candidate;
    }
}