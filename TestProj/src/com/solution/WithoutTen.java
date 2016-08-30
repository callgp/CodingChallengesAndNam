package com.solution;

import java.util.Arrays;

public class WithoutTen {

	public static void main(String[] args) {		
		int[] ar={0, 2, 0};
		int[] ar2={10, 50, 13,30,11, 10, 14, 10,9};
		System.out.println("value is--->"+Arrays.toString(withoutTen(ar)));
		System.out.println("value two is--->"+Arrays.toString(withoutTen(ar2)));
	}
	
	public static int[] withoutTen(int[] nums) {		  
				int len=nums.length;
				int[] arr=new int[len];
				int front=0;
				int back=len-1;
				  for(int i=0;i<nums.length;i++){		    
				    if(nums[i]%10==1||nums[i]%10==2||nums[i]%10==3||nums[i]%10==4||nums[i]%10==5||nums[i]%10==6||nums[i]%10==7||nums[i]%10==8||nums[i]%10==9){	
				    	arr[front]=nums[i];
				    	front++;
				    	
				  }
				 /* else {
					  arr[back]=nums[i];
				    	back--;
				  }
				    if(arr[i]%10==0){
				    	arr[i]=0;
				    }*/
				  }
				  return arr;
				
		  
}

}
