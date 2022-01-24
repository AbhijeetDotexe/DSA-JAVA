import java.io.*;
import java.util.*;

public class RotateArray {
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(nums,k);
		System.out.println(Arrays.toString(nums));
	}


	public static void rotate(int[] nums, int k) {
        
        k = k % nums.length;
        reverse(nums,0, nums.length-k-1);
        reverse(nums,nums.length-k, nums.length-1);
        reverse(nums,0,nums.length-1);

        
    }

    public static void reverse(int[] nums, int start, int end){

    	while(start<end){
    		int temp = nums[start];
    		nums[start] = nums[end];
    		nums[end] = temp;
    		start++;
    		end--;
    	}
    }
}




   //nums = [1,2,3,4,5,6,7], k = 3
    //5,6,7,1,2,3,4   
	 
	 //logic :
	 //7,6,5,4,3,2,1  : Reverse All start = 0  end = nums.length -1 
	 //5,6,7,4,3,2,1  : Reverse front(first group elements) start = 0 end = K-1
	 //5,6,7,1,2,3,4  : Reverse  end(second group elements) start = k end = nums.length -1