import java.io.*;
import java.util.*;

public class IntersectionOf2Array {
	public static void main(String[] args) {
		
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		System.out.println(Arrays.toString(intersection(nums1,nums2)));
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
        
        int i=0;
        int[] freq = new int[1000];
        for(int x: nums1){
        	freq[x]++;
        }

        List<Integer> list = new ArrayList<>();
        for(int x: nums2){
        	if (freq[x]>0) {
        		list.add(x);
        		freq[x] = 0;
        	}
        }
        int[] arr = new int[list.size()];
        for(Integer x: list){
        	arr[i++] = x;
        }
        return arr;
    }
}