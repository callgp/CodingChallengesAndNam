package com.solution;

import java.lang.*;
import java.util.Arrays;

public class SystemDemo2 {

	public static void main(String[] args) {
		String words[] = { "a", "b", "c", "d" };
		System.out.println("vslue is--->" + Arrays.toString(wordsFront(words, 1)));		

	}

	public static String[] wordsFront(String[] words, int n) {
		String[] newwords = new String[n];
		// copies an array from the specified source array
		System.arraycopy(words, 0, newwords, 0, 1);
		// System.out.print("array2 = ");
		System.out.print(newwords[0] + " ");
		// System.out.print(newwords[1] + " ");
		// System.out.print(arr2[2] + " ");
		// System.out.print(arr2[3] + " ");
		// System.out.print(arr2[4] + " ");
		// return System.arraycopy(words, 0,newwords,0, n);
		return newwords;

	}

}
