package com.solution;

import java.util.Arrays;
public class Fix{
	public static void main(String[] args) {
		int[] input = {2, 3, 4, 6, 4, 7, 5, 5, 4, 8, 5};
		System.out.println("  input -->" + Arrays.toString(input));
		fix45(input);
	}
	public static int[] fix45(int[] nums) {
        int[] arr = new int[nums.length];
  	    for (int z = 0; z < nums.length; z++){
	        if (nums[z] == 4) {
	          arr[z] = 4;
	          arr[z + 1] = 5;
	        }
        }
		System.out.println(" output -->" + Arrays.toString(arr) + " (after first for loop)");
        int mark = 0;
	    for (int j = 0; j < nums.length; j++){
	        if(arr[j] == 0){
	          for (int k = mark; k < nums.length; k++){
	            if(nums[k] != 4 && nums[k] != 5){
	               arr[j] = nums[k];
				   mark = k + 1;
				   System.out.println(" j is " + j + ", k is " + k + ", mark is " + mark);
				   System.out.println(" output -->" + Arrays.toString(arr));
	               break;
	            }   
	          }
	        } 
        }
	      return arr;	
}
}