package com.abhijeet.Questions;

//Write a program to print prime numbers till a given number

import java.util.Arrays;

public class PrimeTillN {
    public static void main(String[] args) {
        int n = 200;
        boolean[] primes = new boolean[n+1];
//        for (int i = 0; i <n ; i++) System.out.println(Arrays.toString(new boolean[]{primes[i]}));
        primeTillN(n,primes);
    }

    public static void primeTillN(int n, boolean[] primes){
        for (int i = 2; i*i <=n ; i++) {
            if (!primes[i]){
                for (int j = i*2; j <n ; j+=i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <=n ; i++) {
            if (!primes[i]){
                System.out.print(i+" ");
            }
        }
    }


}
