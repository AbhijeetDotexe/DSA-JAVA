import java.io.*;
import java.util.*;

public class SquareRoot {
	public static void main(String[] args) {
		
		System.out.println(mySqrt(13));
	}

	    public static int mySqrt(int x) {
        
        	if (x == 0) {
        		return 0;
        	}

        	int s = 1, e = x;
        	while(s<=e){

        		int mid = s+(e-s)/2;
        		if (mid > x/mid) {
        			e = mid -1;
        		}else if (mid < x/mid) {
        			s = mid+1;
        		}else{
        			return mid;
        		}

        	}
        	return s-1;
    }
}