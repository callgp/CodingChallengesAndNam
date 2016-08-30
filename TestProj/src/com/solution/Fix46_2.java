package com.solution;

import java.util.Arrays;

public class Fix46_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 1, 4, 1, 5 };
		System.out.println("fix45 -->" + Arrays.toString(fix45(ar)));

	}

	public static int[] fix45(int[] nums) {
		
        int[] arr = new int[nums.length];
	    for (int z = 0; z < nums.length; z++){
	        if (nums[z] == 4) {
	          arr[z] = 4;
	          arr[z + 1] = 5;
	        }
      }
      int mark = 0;
	      for (int j = 0; j < nums.length; j++){
	        if(arr[j] == 0){
	          for (int k = mark; k < nums.length; k++){
	           if(nums[k] != 4 && nums[k] != 5){
	               arr[j] = nums[k];
	               mark = k + 1;
	               break;
	           }
	          }
	        } 
      }
	      return arr;
}
}
