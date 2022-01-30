import java.io.*;
import java.util.*;

public class MergeSortArray {
	public static void main(String[] args) {
		
		int m = 3;
		int n = 3;
		// int[] nums1 = new int[m+n];
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
		

	}

	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int p1 = m-1;
        int p2 = n-1;
        int p3 = m+n-1;

        while(p2>=0){

        	if (p1>=0 && nums1[p1]>nums2[p2]) {
        		nums1[p3] = nums1[p1];
        		p1--;
        		p3--;
        	}else {
        		nums1[p3] = nums2[p2];
        		p2--;
        		p3--;
        	}
        }
    }
}