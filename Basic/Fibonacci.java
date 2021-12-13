package com.abhijeet.Basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth term you want to find in the Fibonacci Series : ");
        int n = sc.nextInt();
        double a = 0;
        double b = 1;
        int count = 2;
//        if(n==0){
//            System.out.println("The N th of the fibonacci series is : "+ a);
//        }else if (n==1 || n==2){
//            System.out.println("The Nth Term of the fibonacci series is : "+b );
//        }
        while (count<=n){
            double temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println("The Nth Term Of the fibonacci Series is : "+ b);
    }
}
