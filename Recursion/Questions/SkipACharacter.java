package com.abhijeet.Recursion.Questions;

public class SkipACharacter {

    public static void main(String[] args) {

        skip(" ","abhijeet");
        System.out.println(skip("Lakshay"));
    }

    static void skip(String p, String up){ // p = processed and up = unprocessed

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a'){
            skip(p,up.substring(1));
        }else {
            skip(p+ch,up.substring(1));
        }
    }

    //Returning a String
    static String skip(String up){ // p = processed and up = unprocessed

        if (up.isEmpty()){
            return " ";
        }

        char ch = up.charAt(0);

        if (ch == 'a'){
            return skip(up.substring(1));
        }else {
            return ch +skip(up.substring(1));
        }
    }
}
