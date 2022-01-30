import java.io.*;
import java.util.*;

public class HeightChecker {
	public static void main(String[] args) {
		
		int[] heights = {5,1,2,3,4};
		System.out.println(heightChecker(heights));
	}

	 public static int heightChecker(int[] heights) {
        
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        int count = 0;
        for (int i=0;i<heights.length ;i++ ) {
        	if (heights[i]!=expected[i]) {
        		count++;
        	}
        }
        return count;
    }
}