import java.io.*;
import java.util.*;

public class FirstPositive {
	public static void main(String[] args) {
		

        int[] arr = {1,2,0};
        int[] a = {3,4,-1,1};
        int ans = firstMissingPositive(a);
        System.out.println(ans);
	}


	 public static int firstMissingPositive(int[] arr) {

	 	int i = 0;
	 	while (i < arr.length) {
	 		int correctIndex = arr[i]-1;
	 		if (arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correctIndex]) {
	 			int temp = arr[i];
	 			arr[i] = arr[correctIndex];
	 			arr[correctIndex] = temp;
	 		}else {
	 			i++;
	 		}
	 	}

		//Search for first Missing Number
	 		for (int index=0;index<arr.length ;index++ ) {
	 			if (arr[index]!=index+1) {
	 				return index+1;
	 			}
	 		}
	 		return arr.length+1;
	 	}
	 }

