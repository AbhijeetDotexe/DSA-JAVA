package com.abhijeet;

public class FindMin {
    public static void main(String[] args) {
        int[] ar = {18,12,-7,3,14,18};
        int b = MinSearch(ar);
        System.out.println(b);
    }
// Assume that array length is not equal to 0
// return the minimum value in the array
    static int MinSearch(int[] arr){
        int ans = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
