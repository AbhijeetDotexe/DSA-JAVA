import java.io.*;
import java.util.*;

public class ExcelSheet {
	public static void main(String[] args) {
		
		int columnNumber = 701;
		System.out.println(convertToTitle(columnNumber));
	}

	public static String convertToTitle(int columnNumber) {
        
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0){
        	if (columnNumber<26) {
        		sb.append((char)(columnNumber+64));
        		break;	
        	}else {
        		int letter = columnNumber%26;
        		columnNumber/=26;
        		if (letter == 0) {
        			sb.append("Z");
        			columnNumber--;
        		}else {
        			sb.append((char)(letter+64));
        		}
        	}
        }
        return sb.reverse().toString();
    }
}