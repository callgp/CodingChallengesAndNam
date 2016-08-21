import java.util.Arrays;

public class TwoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {4, 2, 2, 3 };
		System.out.println("is-->" + twoTwo(ar));
	}

	public static boolean twoTwo(int[] nums) {
		
		boolean result=true;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				int count = 0;
				for (int k = i; k < nums.length; k++) {
					if (nums[k] == 2)
						count++;
					else
						break;
				}
				i = i+count;
				if (count < 2)
					result=false;
			}
		}
		return result;
	}

}
