package com.abhijeet.Questions;

import java.util.Arrays;

public class SumZero {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(Arrays.toString(sumZero(n)));
    }

    public static int[] sumZero(int n){
        
        int[] ans = new int[n];
        for (int i = 0,a=1; i <n/2 ; i++,a++) {
            ans[i] = a;
            ans[n-1-i] = -a;
        }
        return ans;
    }
}
