import java.util.*;
import java.util.Scanner;

public class test{
	public static void main(String[] args){
		System.out.print("Enter The number Whose table u want to see: ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.print("Enter the number till u want to see the table of the number to: ");
		int b = s.nextInt();	
		System.out.println();
		for(int i=1;i<=b;i++){
			System.out.println("  "+a+"*"+i+" = "+a*i);
		}
	}
}
