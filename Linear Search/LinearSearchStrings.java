package com.abhijeet;

import java.util.Arrays;

public class LinearSearchStrings {
    public static void main(String[] args) {
        String name = "Lakshay";
        char target = 's';
        Boolean a = SearchString(name,target);
        Boolean b = SearchString(name,target);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(a);
        System.out.println(b);

    }
    static boolean SearchString(String str, char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i <str.length() ; i++) {
            if (target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static boolean SearchString2(String str, char target){
        if (str.length()==0){
            return false;
        }
        for (char ch: str.toCharArray()){
            if (ch==target){
                return true;
            }
        }
        return false;
    }
}
