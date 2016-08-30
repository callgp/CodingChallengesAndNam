package com.solution;

import java.util.Arrays;

public class Fix45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar={1,4,1,5};
		System.out.println("fix45 -->"+Arrays.toString(fix45(ar)));

	}

	
	public static int[] fix45(int[] nums) {
		  for (int x = 0; x < nums.length; x++) {
		    if (nums[x] == 4) {
		      for (int y = 0; y < nums.length; y++) {
		        if (nums[y] == 5) {
		          if (y > 0 && nums[y-1] != 4) {
		            int buffer = nums[x+1];
		            nums[x+1] = 5;
		            nums[y] = buffer;
		          } 
		          else if (y == 0) {
		            int buff = nums[x+1];
		            nums[x+1] = 5;
		            nums[y] = buff;
		          }
		                     
		        }
		      }
		    }
		  }
		  return nums;
		}
}
