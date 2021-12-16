package com.abhijeet.Recursion.Basic;

public class FiboRec {
    public static void main(String[] args) {
        for (int i = 0; i <70 ; i++) {
            System.out.println(fiboRec(i));
        }

    }

    static long fiboRec(int n){
        //return (int) (1/Math.sqrt(5)*(Math.pow((1+Math.sqrt(5))/2,n))-(1/Math.sqrt(5))*(Math.pow((1-Math.sqrt(5))/2,n)));
        //return (long) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
        //return (long) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
        return (long) ((Math.pow((1+Math.sqrt(5))/2,n)-(Math.pow((1-Math.sqrt(5))/2,n)))/Math.sqrt(5));
    }
}
