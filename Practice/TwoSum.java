import java.io.*;
import java.util.*;

public class TwoSum {
	public static void main(String[] args) {
		
		int[] nums = {2,7,11,15};
		int[] numbers = {2,3,4};
		int target = 6;
		int[] ans = twoSum(numbers, target);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] twoSum(int[] numbers, int target) {
        
     	int low = 0, high = numbers.length-1;
     	while(low<high){

     		if ((numbers[low]+numbers[high]) == target) {
     			
     			return new int[]{low+1,high+1};
     		}
     		else if ((numbers[low]+numbers[high])<target) {
     			low++;
     		}
     		else {
     			high--;
     		}
     	}
     		return new int[]{0,0};
    }
}