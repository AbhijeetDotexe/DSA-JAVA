import java.io.*;
import java.util.*;

public class GoodArray {
	public static void main(String[] args) {

		int[] nums = {12,5,7,23};
		int[] arr = {3,6};
		System.out.println(isGoodArray(arr));
		
	}

	 public static boolean isGoodArray(int[] nums) {

	 	int result = 0;
	 	for(int elements: nums){
	 		result = gcd(result, elements);
	 	
	 	if (result == 1) {
	 		
	 		return true;
	 	}
	 }
	 	return false;
    }


        static int gcd(int a, int b){
        	
        	if (a==0){
        		return b;
        	}
        	return gcd(b%a,a);	
        }
}