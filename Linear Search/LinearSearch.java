package com.abhijeet;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23,45,31,87,25,11,9,22};
        int a = LSearch(nums,87);
        System.out.println(a);
    }
    static int LSearch(int[] arr, int target){
        if (arr.length == 0){
            System.out.println("There is no Array To Search the element in");
            return -1;
        }
        // run a for loop
        for (int i = 0; i < arr.length ; i++) {
            int element = arr[i];
            if (element == target){
                return i+1;
            }
        }
        System.out.println("Element is not present in the Array, OOPS!");
        return -1;
    }
}
