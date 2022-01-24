import java.io.*;
import java.util.*;

public class GuessNumber {
	public static void main(String[] args) {
		
		//An api is given in the solution so no need to create a seprate function for
		// guessing if the number is smaller, greater or equal to the number you have guessed
	}

	public static int guessNumber(int n) {
        
        int start = 1;
        int end = n;
        while(true){

        	int mid = start + (end-Start)/2;
        	int temp = guess(mid);

        	if (temp == 0) {
        		return mid;
        	}else if (temp == 1) {
        		start = mid+1;
        	}else {
        		end = mid-1;
        	}

        }
    }
}