import java.io.*;
import java.util.*;

public class LargestPerimeter {
	public static void main(String[] args) {
		int[] nums = {2,1,2};
		System.out.println(largestPerimeter(nums));
	}

	public static int largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
        int index = nums.length-3;
        int a,b,c;
        while(index>=0){
        	a=nums[index];
        	b=nums[index+1];
        	c=nums[index+2];

        	if (a+b>c) {
        		return a+b+c;
        	}
        	index--;
        }
        return 0;
    }
}