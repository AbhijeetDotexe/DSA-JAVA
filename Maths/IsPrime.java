package com.abhijeet.Maths;

public class IsPrime {
    public static void main(String[] args) {
        int n = 1000;
        int sum = 0;
        int count = 0;
        for (int i = 0; i <=n ; i++) {
            //System.out.println(i+" "+ isPrime(i));
            if (isPrime(i)){
                System.out.println(i);
                count++;
                sum+=i;
            }
        }
        System.out.println("The Total prime Number between 1 and "+n+" are:"+count+" and their sum is: "+sum);
    }

    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while(c*c<= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
