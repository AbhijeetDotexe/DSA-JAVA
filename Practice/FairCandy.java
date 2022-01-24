import java.io.*;
import java.util.*;

public class FairCandy {
	public static void main(String[] args) {
		
		int[] aliceSizes = {1,1};
		int[] bobSizes = {2,2};

		int[] ans = fairCandySwap(aliceSizes, bobSizes);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        int totalAlice = sum(aliceSizes);
        int totalBob = sum(bobSizes);


        int difference = (totalAlice - totalBob)/2;

        Arrays.sort(aliceSizes);

        for(int i: bobSizes){

        	if (binarySearch(aliceSizes, difference+i)>=0) {
        		return new int[]{difference+i, i};
        	}
        }
        return null;
    }

    public static int sum(int[] arr){

    	int sum = 0;

    	for (int i=0;i<arr.length ;i++ ) {
    		sum+=arr[i];
    	}
    	return sum;
    }

    public static int binarySearch(int[] arr, int target){

    	int start=0, end = arr.length-1;

    	while(start<=end){
    		int mid = start+(end-start)/2;
    		if(arr[mid]<target) start = mid+1;
    		else if(arr[mid]>target) end = mid-1;
    		else return mid;
    	}
    	return -1;
    }
}