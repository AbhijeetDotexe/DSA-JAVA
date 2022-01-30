import java.io.*;
import java.util.*;

public class DecryptString {
	public static void main(String[] args) {
		
		String s ="10#11#12";
		System.out.println(freqAlphabets(s));
	}

	public static String freqAlphabets(String s) {
        
        String ans = "";
        for (int i=s.length()-1;i>=0 ;i-- ) {
        	char c = s.charAt(i);

        	if (c=='#') {
        		String val = s.charAt(i-2)+""+s.charAt(i-1);
        		ans = (char)(Integer.parseInt(val)+96)+ans;
        		i-=2;	
        	}else {
        		ans = (char)(Integer.parseInt(String.valueOf(c))+96)+ans;
        	
}        }
        return ans;
    }
}