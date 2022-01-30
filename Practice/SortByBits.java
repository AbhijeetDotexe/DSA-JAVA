import java.io.*;
import java.util.*;

public class SortByBits {
	public static void main(String[] args) {
		int[] arr = {1024,512,256,128,64,32,16,8,4,2,1};
		int[] arr2 = {0,1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(sortByBits(arr2)));
	}

	public static int[] sortByBits(int[] arr){

		int[] bits = new int[arr.length];
		int[] ans = new int[arr.length];
		Arrays.sort(arr);

		for (int i=0;i<arr.length ;i++ ) {
			int count =0;
			int n = arr[i];
			while(n>0){

				if ((n&1)==1) {
					count++;
				}
				n>>=1; //Right Shifting of n that means dividing it by 2
			}
			bits[i] = count;
		}

		int l = 0;
		for(int j=0;j<14;j++){
			int length = 0;
			for(int k=0;k<bits.length;k++){
				if (j==bits[k]) {
					length++;
					ans[l]=arr[k];
					l++;
				}
			}
		}
		return ans;
	}
}