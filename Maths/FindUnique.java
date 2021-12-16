package com.abhijeet.Maths;

public class FindUnique {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1,7,8,8,7};
        System.out.println(Unique(arr));

    }

    static int Unique(int[] arr){
        int unique = 0;
        for (int n: arr){
            unique ^= n;
        }
        return unique;
    }
}
