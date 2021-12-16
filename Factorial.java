package com.abhijeet.Recursion.Basic;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    static long factorial(int n){
        if (n == 0 || n == 1 ){
            return 1;
        }
        return n*factorial(n-1);
    }
}
