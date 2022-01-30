import java.io.*;
import java.util.*;

public class MaxProductOf3Numbers {
	public static void main(String[] args) {
		int[] nums = {3,2,1};
		System.out.println(maximumProduct(nums));
	}

	public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3] , nums[0]*nums[1]*nums[n-1]);
    }
}