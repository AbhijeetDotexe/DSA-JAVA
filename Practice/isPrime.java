package com.abhijeet.Questions;

public class isPrime {
    public static void main(String[] args) {
        Prime(131);
    }

    public static void Prime(int n){
        if (n <= 1){
            System.out.println("The Number is not prime!");
        }

        int c = 2;

        while (c*c <= n){
            if (n % c == 0){
                System.out.println("The number is not prime");
                return;
            }
            c++;
        }
        System.out.println("The given number is prime");
    }
}
