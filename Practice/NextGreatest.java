import java.io.*;
import java.util.*;

public class NextGreatest {
	public static void main(String[] args) {
		
		char[] letters = {'c','f','j'};
		char target = 'z';
		System.out.println(nextGreatestLetter(letters, target));
	}


	 public static char nextGreatestLetter(char[] letters, char target) {
        
        int start = 0, end = letters.length-1;

        while(start<=end){

        	int mid = start +(end-start)/2;

        	if (letters[mid]>target) {
        		end = mid-1;
        	}else {
        		start = mid+1;
        	}
        }

        return start>0 && start<letters.length ? letters[start]: letters[0];
    }
}