import java.io.*;
import java.util.*;

public class JumpGame {
	public static void main(String[] args) {
		
		int[] jumps = {2,3,1,1,4};
		System.out.println(canJump(jumps));
	}


	public static boolean canJump(int[] jumps){

		int maxJumpIndex = 0;
		for (int i = 0 ;i<=maxJumpIndex && maxJumpIndex<jumps.length ;i++ ) {
			maxJumpIndex = Math.max(jumps[i]+i, maxJumpIndex);
		}

		return maxJumpIndex>=jumps.length-1;
	}


}