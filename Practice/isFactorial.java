package com.abhijeet.Questions;

public class isFactorial {

    public static void main(String[] args) {
        System.out.println(isFact(6));
    }

    public static int isFact(int n){
        if (n == 0){
            return 1;
        }
        return n * isFact(n-1);
    }
}
