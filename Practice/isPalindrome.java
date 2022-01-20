package com.abhijeet.Questions;

public class isPalindrome {

    public static void main(String[] args) {

        palin(1212121);
    }

    public static void palin(int n){
        if (n == reverseNumber(n)){
            System.out.println("Yes, The given number is a palindrome");
        }else {
            System.out.println("No, The given number is not a palindrome");
        }
    }


    static int sum = 0;

    public static int reverseNumber(int n){
        if (n == 0){
            return 0 ;
        }
        int rem = n % 10;
        sum = sum* 10 + rem;
        reverseNumber(n/10);

        return sum;
    }
}
