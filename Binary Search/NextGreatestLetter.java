package com.abhijeet.BinarySearch;

//Q-744 LeetCode- Find the Smallest Letter Greater than the target letter


public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','d','e','f','g','h'};
        char target = 'd';
        char ans = SmallestLetters(letters, target);
        System.out.println(ans);
    }

    static char SmallestLetters(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        while (start<=end){
            int mid = start +(end-start)/2;

            if (target<letters[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return letters[start % letters.length];

    }
}
