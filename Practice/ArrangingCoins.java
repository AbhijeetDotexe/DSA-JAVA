import java.io.*;
import java.util.*;

public class ArrangingCoins {
	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(arrangeCoins(n));
	}



	 public static int arrangeCoins(int n) {
        	
        	int i = 1;
        	int count = 0;

        	if (n==1) {
        		
        		return 1;
        	}

        	while(i<=n){
        		n = n-i;
        		count++;
        		i++;
        	}

        	return count;
        
    }
}