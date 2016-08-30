package com.solution;

import java.util.Arrays;

public class Fix35_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar={1, 3, 1, 4};
		System.out.println("value-->"+Arrays.toString(fix34(ar)));

	}
	
	public static int[] fix34(int[] nums) {
		
        int[] arr = new int[nums.length];
	    for (int z = 0; z < nums.length; z++){
	        if (nums[z] == 3) {
	          arr[z] = 3;
	          arr[z + 1] = 4;
	        }
      }
      int mark = 0;
	      for (int j = 0; j < nums.length; j++){
	        if(arr[j] == 0){
	          for (int k = mark; k < nums.length; k++){
	           if(nums[k] != 3 && nums[k] != 4){
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
