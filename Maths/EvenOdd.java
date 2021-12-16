package com.abhijeet.Maths;

public class EvenOdd {
    public static void main(String[] args) {

        System.out.println(evenOdd(78));

    }

    static boolean evenOdd(int a){
        if ((a&1)==1){
            System.out.println("The Number is Odd!");

        }else {
            System.out.println("The Given number is even!");
        }
        return true;
    }
}
