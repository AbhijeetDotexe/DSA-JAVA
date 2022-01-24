import java.io.*;
import java.util.*;

public class PeakIndex {
	public static void main(String[] args) {
		
		int[] arr = {0,10,5,2};
		System.out.println(peakIndexInMountainArray(arr));
	}


	 public static int peakIndexInMountainArray(int[] arr) {
        
        int start = 1, mid, end = arr.length-1;
        //Start = 1 because 0 cannot be the target element in a mountain array
        while(start<=end){

        	mid = start+(end-start)/2;
        	if (arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) {
        		return mid;
        	}else if (arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1] ) {
        		end = mid-1;
        	}else {
        		start = mid+1;
        	}
        }

        return end;	
    }
}