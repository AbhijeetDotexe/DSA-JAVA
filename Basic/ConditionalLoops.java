package com.abhijeet.Basic;

import java.util.Scanner;

public class ConditionalLoops {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your salary : ");
        int a = s.nextInt();
        if (a>40000){
            a += a * 0.08;
        }else{
            a+= a * 0.06;
        }
        System.out.println("Your salary after increment is : "+ a);
    }
}
