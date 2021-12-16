package com.abhijeet.Recursion.Questions;

public class AsciiValue {

    public static void main(String[] args) {

        asciiValue("","abc");
    }

    static void asciiValue(String p, String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        asciiValue(p+ch, up.substring(1));
        asciiValue(p,up.substring(1));
        asciiValue(p+(ch+0),up.substring(1));
    }
}
