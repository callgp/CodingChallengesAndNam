import java.util.Arrays;
import java.util.Scanner;

/*There's nothing particularly wrong with your pseudo-code it is
 *  just point 3 that needs to be expanded, ie. Now you know the 
 *  i-th element is zero, HOW do you find the biggest odd number
 *   after the i-th element.
Hint: to find the max you need to look at each element from the 
one after the i-th element to the end of the array, ie. you need 
a second loop. This will be within the first, main loop.*/
public class ZeroMax2 {

	public static void main(String[] args) {
		int[] ar = { 0, 5, 0, 3 };
		System.out.println("value is" + Arrays.toString(zeroMax(ar)));

		/*
		 * Return a version of the given array where each zero value in the
		 * array is replaced by the largest odd value to the right of the zero
		 * in the array. If there is no odd value to the right of the zero,
		 * leave the zero as a zero.
		 * 
		 * zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3] zeroMax([0, 4, 0, 3]) → [3, 4,
		 * 3, 3] zeroMax([0, 1, 0]) → [1, 1, 0]
		 * 
		 * Hint: to find the max you need to look at each element from the one
		 * after the i-th element to the end of the array, ie. you need a second
		 * loop. This will be within the first, main loop.
		 */
	}

	public static int[] zeroMax(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				
				if (nums[i] == 0) {
					int largest=nums[i];
					for (int j = i; j < nums.length; j++) {
						
						if(nums[j]>largest&&nums[j]%2==1){
							largest=nums[j];
							
						}
						if(largest>0){
							nums[i]=largest;
						}

					}
					
					
					
				}

			}
//i=i+i;
		}

		return nums;

	}

}
