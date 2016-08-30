package com.solution;

import java.util.Arrays;

public class Fix34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar={1, 3, 1, 4, 4, 3, 1};
		System.out.println("value-->"+Arrays.toString(fix34(ar)));

	}
	
	public static int[] fix34(int[] nums) {
	    for (int z = 0; z < nums.length; z++)
	        if (nums[z] == 3) {
	            int buffer = nums[z + 1];
	            nums[z + 1] = 4;
	            for (int j = z + 2; j < nums.length; j++)
	                if (nums[j] == 4) 
	                	nums[j] = buffer;
	        }
	    return nums;
	}

}
