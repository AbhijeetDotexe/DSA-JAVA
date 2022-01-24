import java.io.*;
import java.util.*;

public class CheckDouble {
	public static void main(String[] args) {
		
		int[] arr = {10,2,5,3};
		int[] nums = {7,1,14,11};
		System.out.println(checkIfExist(nums));
	}

	public static boolean checkIfExist(int[] arr) {
        
        for (int i=0;i<arr.length ;i++ ) {
        	for(int j=0;j<arr.length;j++){
        		if (i!=j && arr[i]==arr[j]*2 ) {
        			return true;
        		}
        	}
        }
        return false;
    }
}