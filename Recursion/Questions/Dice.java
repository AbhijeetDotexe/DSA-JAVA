package com.abhijeet.Recursion.Questions;
import java.util.ArrayList;

public class Dice {

    public static void main(String[] args) {

//        diceCombination("",4);
        ArrayList<String> ans = diceList("",4);
        System.out.println(ans);
    }

    static void diceCombination(String p, int target){

        if (target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <=6 && i<=target ; i++) {
            diceCombination(p+i, target-i);
        }
    }

    //Same function but this time we are returning an ArrayList
    static ArrayList<String> diceList(String p, int target){

        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <=6 && i<=target ; i++) {
            ans.addAll(diceList(p+i, target-i));
        }
        return ans;
    }
}
