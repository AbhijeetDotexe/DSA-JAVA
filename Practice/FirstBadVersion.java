import java.io.*;
import java.util.*;

public class FirstBadVersion {
	public static void main(String[] args) {
		
		// An api is given in the solution so no need to make a seprate function for finding 
		//Whether a given number is bad or not
	}


	 public int firstBadVersion(int n) {
     
	 	int start = 1;
	 	int end = n;
	 	int ans = -1;

	 	while(start<= end ){

	 		int mid = start + (end-start)/2;

	 		boolean isbad = isBadVersion(mid);
	 		if (isbad) {
	 			
	 			ans = mid;
	 			end = mid-1;
	 		}
	 		else {
	 			start = mid+1;
	 		}
	 	}

	 	return ans;

    }
}