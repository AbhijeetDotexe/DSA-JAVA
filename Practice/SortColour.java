import java.io.*;
import java.util.*;
import java.util.Arrays;

public class SortColour {
	public static void main(String[] args) {

		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
		System.out.println(Arrays.toString(nums));
		
	}

	 public static void sortColors(int[] nums){

	 		int CountOne = 0, CountTwo = 0, CountZero = 0;
	 		for (int i = 0;i<nums.length ;i++ ) {
	 			if (nums[i] == 0) {
	 				CountZero++;
	 			}
	 			else if (nums[i] == 1) {
	 				CountOne++;
	 			}
	 			else{
	 				CountTwo++;
	 			}
	 		}

	 		int i = 0;
	 		while(i<CountZero){
	 			nums[i] = 0;
	 			i++;
	 		}
	 		int j = 0;
	 		while(j<CountOne){
	 			nums[i] = 1;
	 			i++;
	 			j++;
	 		}
	 		int k = 0;
	 		while(k<CountTwo){
	 			nums[i] = 2;
	 			i++;
	 			k++;
	 		}
	 }

}