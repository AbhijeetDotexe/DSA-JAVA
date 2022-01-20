package com.abhijeet.Questions;

public class MoveChips {
    public static void main(String[] args) {

        int[] position = {2,2,2,3,3};
        System.out.println(minCostToMoveChips(position));
    }

    public static int minCostToMoveChips(int[] position){

        int[] ans = new int[2];
        for (int i = 0; i < position.length ; i++) {
            if (position[i]%2 == 0){
                ans[0]+= 1;
            }else {
                ans[1]+= 1;
            }
        }
        return Math.min(ans[0],ans[1]);
    }
}
