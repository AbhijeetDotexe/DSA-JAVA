package com.abhijeet.Recursion.Questions;

import java.util.ArrayList;

public class SubSeq {

    public static void main(String[] args) {
       //subSequence(" ","abc");
        System.out.println(subSequenceRet(" ","abc"));

    }

    static void subSequence(String p, String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSequence(p+ch,up.substring(1));
        subSequence(p,up.substring(1));
    }

    //Returning an ArrayList
    static ArrayList<String> subSequenceRet(String p, String up){

        if (up.isEmpty()){

            ArrayList<String> e = new ArrayList<>();
             e.add(p);
             return e;
        }

        char ch = up.charAt(0);

        ArrayList<String> Left = subSequenceRet(p+ch,up.substring(1));
        ArrayList<String> Right =  subSequenceRet(p,up.substring(1));

        Left.addAll(Right);
        return Left;
    }
}
