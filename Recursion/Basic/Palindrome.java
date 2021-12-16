package com.abhijeet.Recursion.Basic;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(palindrome(333));;
    }

    static boolean palindrome(int n){
       return n == reverse(n);
    }

    static int sum = 0;
    static int reverse(int n){
        if (n == 0){
            return 0 ;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n/10);
        return sum;
    }

}
