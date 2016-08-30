package com.solution;

import java.util.Arrays;

public class SquareUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("is--->"+Arrays.toString(squareUp(5)) );

	}
	
	public static int[] squareUp(int n) {
	    int[] finalRes = new int[n * n];
	    int indx = 0;
	 
	    for (int i = 1; i <= n; i++) {
	        for (int k = 1; k <= n - i; k++)
	        	finalRes[indx++] = 0;
	        for (int j = i; j > 0; j--) 
	        	finalRes[indx++] = j;
	    }
	    return finalRes;
	}

}
