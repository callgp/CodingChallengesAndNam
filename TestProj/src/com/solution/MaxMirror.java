package com.solution;

public class MaxMirror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 1, 2, 3, 8, 9, 3, 2, 1 };
		int[] ar1 = { 1, 2, 1, 4};
		//System.out.println("value===>" + maxMirror(ar));
		System.out.println("value===>" + maxMirror(ar1));
	}

	public static int maxMirror(int[] nums) {
		int len = nums.length;
		int total = 0;
		int highest = 0;
		for (int x = 0; x < len; x++) {
			total = 0;
			for (int j = len - 1; x + total < len && j > -1; j--) {
				if (nums[x + total] == nums[j]) {
					total++;
				} else {
					if (total > 0) {
						highest = Math.max(total, highest);
						total = 0;
					}
				}
			}
			highest = Math.max(total, highest);
		}
		return highest;
	}

}
