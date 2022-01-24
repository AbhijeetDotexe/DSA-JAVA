import java.io.*;
import java.util.*;

public class test {
	public static void main(String[] args) {
		
		int[] arr = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(sortAndSearch(arr,target));
	}


	public static int sortAndSearch(int[] arr, int target){

		Arrays.sort(arr);
		return binarySearch(arr,target);

	}

	  static int binarySearch(int[] arr, int Target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            //we cannot use (start+end)/2 to find the middle value
            //because in some cases their sum will exceed the value of int data type
            //So we use a modified version of the same formula
            int mid = start +(end-start)/2;

            if (Target<arr[mid]){
                end = mid-1;
            }
            else if (Target>arr[mid]){
                start = mid+1;
            }else {
                //Answer found if this statement executes
                return mid;
            }
        }
        //if the element is not present in the array it will return -1
        return -1;
    }
}