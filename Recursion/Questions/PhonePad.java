package com.abhijeet.Recursion.Questions;
import java.util.ArrayList;

public class PhonePad {

    public static void main(String[] args) {
        //phonePad(" ","12");
        ArrayList<String> ans = phonePadArrayList("","12");
        System.out.println(ans);
    }

    static void phonePad(String p, String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';//This will convert '2' into 2

        for (int i = (digit-1) *3; i <digit *3 ; i++) {
            char ch = (char) ('a'+i);
            phonePad(p+ch,up.substring(1));
        }
    }

    //Returning ArrayList for the same function
    static ArrayList<String> phonePadArrayList(String p, String up){

        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';//This will convert '2' into 2

        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit-1) *3; i <digit *3 ; i++) {
            char ch = (char) ('a'+i);
           ans.addAll(phonePadArrayList(p+ch, up.substring(1)));
        }
        return ans;
    }
}
