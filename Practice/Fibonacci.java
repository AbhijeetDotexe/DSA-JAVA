import java.io.*;
import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(fib(50));
	}

	public static int fib(int n) {
        
        double term1 = (1+ Math.sqrt(5))/2;
        double term2 = (1- Math.sqrt(5))/2;

        double ans = (Math.pow(term1,n)- Math.pow(term2,n))/Math.sqrt(5);

        return (int)ans;
    }
}