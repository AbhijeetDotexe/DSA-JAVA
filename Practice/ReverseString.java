import java.io.*;
import java.util.*;

public class ReverseString {
	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		reverseString(s);
		System.out.println(s);
	}

	public static void reverseString(char[] s) {
        
		reverse(s,0,s.length-1);
    }

    public static void reverse(char[] s, int start, int end){

    	if (start>=end) {
    		return ;
    	}

    	char temp = s[start];
    	s[start] = s[end];
    	s[end] = temp;

    	reverse(s,++start,--end);
    }
}