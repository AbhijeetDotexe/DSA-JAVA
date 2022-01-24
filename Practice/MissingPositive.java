import java.io.*;
import java.util.*;

public class MissingPositive {
	public static void main(String[] args) {
		
		int[] arr = {2,3,4,7,11};
		int k = 5;
		System.out.println(findKthPositive(arr,k));
	}


	 public static int findKthPositive(int[] arr, int k) {
        
        int missingCount = 0;
        int j=1, n=0;
        for (int i=0;i<arr[arr.length-1] ;i++ ) {
        	if (arr[n]!=j) {
        		missingCount++;
        		n--;
        	}
        	if (missingCount == k) {
        		return j;
        	}
        	j++;
        	n++;
        }

        return j + k- missingCount-1;
    }
}