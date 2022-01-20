package com.abhijeet.Questions;


//Write a program to find if the number entered bt the user is even or odd
public class EvenOdd {
    public static void main(String[] args) {
        evenOdd(43);

    }

    public static void evenOdd(int n){
        //Only the last bit in binary can make a number even or odd since the remaining bits are always power of 2
        if ((n&1) == 1){
            System.out.println("The given number is odd");
        }else {
            System.out.println("The given number is odd");
        }
    }
}
