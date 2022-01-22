import java.io.*;
import java.util.*;
import java.util.Arrays;

public class SetMatrixZeros {
	public static void main(String[] args) {
		
		int[][] matrix = {
						  {0,1,2,0},
						  {3,4,5,2},
						  {1,3,1,5}
						};
		for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
         for (int j = 0; j < matrix[i].length; j++) { //this equals to the column in each row.
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
     }

		setZeroes(matrix);
		System.out.println();
		System.out.println();
		


		for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
         for (int j = 0; j < matrix[i].length; j++) { //this equals to the column in each row.
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
     }

		



	}

	 public static void setZeroes(int[][] matrix){

	 		int r = matrix.length;
	 		int c = matrix[0].length;

	 		boolean[] rows = new boolean[r]; 
	 		boolean[] cols = new boolean[c];

	 		for (int i = 0; i< r ;i++ ) {

	 			for (int j=0;j<c ; j++) {
	 				if (matrix[i][j] == 0) {
	 					rows[i] = true;
	 					cols[j] = true;
	 				}
	 			}
	 		}

	 		for (int i = 0;i<r ;i++ ) {
				
				if (rows[i]) {
					for (int j = 0; j< c ;j++ ) {
						
						matrix[i][j] = 0;
					}
					 				
				}	 			

	 		}

	 		for (int j = 0;j<c ;j++ ) {
	 			
	 			if (cols[j]) {
	 				
	 				for (int i = 0;i<r ;i++ ) {
	 					matrix[i][j] = 0;
	 				}
	 			}
	 		}

	 }


}