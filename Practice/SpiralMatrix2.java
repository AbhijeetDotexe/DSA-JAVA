import java.io.*;
import java.util.*;

public class SpiralMatrix2 {
	public static void main(String[] args) {
		
		int n = 3;
		// System.out.println(Arrays.toString(generateMatrix(n)));
		int[][] arr = new int[n][n];
		arr = generateMatrix(n);
		for (int i=0;i<n ;i++ ) {
			for (int j =0;j<arr[i].length;j++ ) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}


	 public static int[][] generateMatrix(int n) {
        
        int[][] arr = new int[n][n];
        int x=1, top = 0, left = 0, bottom = n-1, right = n-1;
        while (top<=bottom && left<=right) {
        	for (int i = left;i<=right ;i++ ) {
        		arr[top][i] = x;
        		x++;
        	}
        	top++;

        	for (int i=top; i<=bottom ;i++ ) {
        		arr[i][right] = x;
        		x++;
        	}
        	right--;

        	for (int i=right;i>=left ;i-- ) {
        		arr[bottom][i] = x;
        		x++;
        	}
        	bottom--;

        	for (int i=bottom;i>=top;i-- ) {
        		arr[i][left] = x;
        		x++;
        	}
        	left++;
        }

        return arr;
    }
}