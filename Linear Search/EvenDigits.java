package com.abhijeet;
//LeetCode Question = 1295

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(FindNumbers(nums));
    }
    static int FindNumbers(int[] nums){
        int count = 0;
        for (int num:nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    //Function to check whether a number contains even number of digits or not
    static boolean even(int num) {
        int NumberOfDigits = digits(num);
        if (NumberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    //Function to count the number of digits in a Number
    static int digits(int num){
        int count = 0;
        if (num<0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }

    // Quicker Way to find the number of digits in the number
    static int digits2(int num){
        if (num<0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        return (int)(Math.log10(num))+1;
    }
}
