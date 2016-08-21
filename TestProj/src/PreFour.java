import java.util.Arrays;

public class PreFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 2,4,1,0,8 };
		System.out.println("value===>" + Arrays.toString(pre4(ar)));

	}

	public static int[] pre4(int[] nums) {
/*		You don't always have to try and do things in one go. Just use two loops....
		the first to find the index of the first 4, now you can create your new 
		array with the correct size, 
		and then use a second loop to copy the elements from the original to new array.*/
		int len = nums.length;		
		int val=0;
		for (int i = 0; i < len; i++) {
			if (nums[i] == 4) {
				val=i;
				break;
			}
		}
		int[] arr = new int[val];
		
		for (int k = 0; k < val; k++) {
		arr[k] =nums[k];
			}
		return arr;

}

}
