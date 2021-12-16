package com.abhijeet;
//LeetCode Question: Richest Person Wealth(1672)
public class MaxWealth {
    public static void main(String[] args) {
        int[][] acc = {
                {1,2,3},
                {3,2,1},
                {4,5,6}
        };
        System.out.println(maximumWealth(acc));
    }
    static int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person <accounts.length ; person++) {
            // When you start a new col take a new sum for the Row
            int sum = 0;
            for (int acc = 0; acc <accounts[person].length ; acc++) {
                    sum = sum + accounts[person][acc];

            }
            //now we have sum of accounts of each person
            //now u have to just check with the overall answer
                if(sum>ans){
                    ans = sum;
                }
        }
        return ans;
    }
}
