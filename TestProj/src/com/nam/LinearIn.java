package com.nam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LinearIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] outer={1,2,4,6};
		int[] inner={2,3,4};
		System.out.println("linearIn is===>"+linearIn(outer,inner));

	}
	public static boolean linearIn(int[] outer, int[] inner) {
		
		//public boolean linearIn(int[] outer, int[] inner) {
			 // List o=Arrays.asList(outer);
			 //   List i=Arrays.asList(inner);
			    Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(outer));
			    Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(inner));
			    if(set1.contains(set2)){
			      return true;
			    }
			    else return false;
			//}
	}

}
