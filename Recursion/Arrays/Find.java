package com.abhijeet.Recursion.Arrays;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 4, 4, 5};
        System.out.println(find(arr, 4, 0));
        System.out.println(findIndex(arr, 4, 0));
        System.out.println(findIndexLast(arr, 4, arr.length - 1));
        findAllIndex(arr, 4, 0);
        System.out.println(list);

        System.out.println(findAllInd(arr, 4, 0, new ArrayList<>()));
        System.out.println(findAllInd2(arr,4,0));
    }

    //For checking if the target element is present in the array or not
    static boolean find(int[] arr, int target, int index) {

        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    //For returning the index value of the target element
    static int findIndex(int[] arr, int target, int index) {

        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }

    }


    //Find The Target value from the back side
    static int findIndexLast(int[] arr, int target, int index) {

        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }

    }


    static ArrayList<Integer> list = new ArrayList<>();

    //For Multiple occurrences of the same target element
    static int findAllIndex(int[] arr, int target, int index) {

        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1);

    }

    //Same function as above but this time we are also returning the array list
    static ArrayList<Integer> findAllInd(int[] arr, int target, int index, ArrayList<Integer> list) {

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllInd(arr, target, index + 1, list);

    }

    //same function but without passing the array list as argument
    //Note this is not a very optimized solution
    static ArrayList<Integer> findAllInd2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }

        //This will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> answerFromBelow = findAllInd2(arr, target, index + 1);
        list.addAll(answerFromBelow);
        return list;


    }
}