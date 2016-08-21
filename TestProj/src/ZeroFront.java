import java.util.Arrays;

public class ZeroFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 0, 1, 1, 0, 1 };
		System.out.println("val is-->" + Arrays.toString(zeroFront(ar)));
	}

	public static int[] zeroFront(int[] nums) { boolean match = false;
	  int count = 0;
	  for (int i = 0; i < nums.length-1; i++) {
	    if (nums[i] == nums[i+1] && !match) {
	      match = true;
	      count++;
	    } 
	    else if (nums[i] != nums[i+1]) {
	      match = false;
	    }
	  }
	  return count;
	  }

}
