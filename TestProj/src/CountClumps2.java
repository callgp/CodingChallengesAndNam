
public class CountClumps2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar={1,1,2,4,7,7,7};
		System.out.println("value--->"+countClumps(ar));

	}

	public static int countClumps(int[] nums) {
		
		 boolean match = false;
		  int counter = 0;
		  for (int i = 0; i < nums.length-1; i++) {
		    if (nums[i] == nums[i+1] && !match) {
		      match = true;
		      counter++;
		    } 
		    else if (nums[i] != nums[i+1]) {
		      match = false;
		    }
		  }
		  return counter;
	}

}
