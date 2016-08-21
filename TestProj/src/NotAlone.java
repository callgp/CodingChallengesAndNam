import java.util.Arrays;

public class NotAlone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 1, 2, 3 };
		System.out.println("value==>" + Arrays.toString(notAlone(ar, 2)));

	}

	public static int[] notAlone(int[] nums, int val) {
		// int val=0;
		for (int i = 1; i < nums.length - 1; i++) {

			if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
				if (nums[i] == val) {
					if (nums[i - 1] < nums[i + 1]) {
						nums[i] = nums[i + 1];
					} else if (nums[i - 1] > nums[i + 1]) {
						nums[i] = nums[i - 1];
					} else if (nums[i - 1] == nums[i + 1]) {
						nums[i] = nums[i];
					}
				}
			}
			// return nums;
		}
		return nums;

		// you didn't check for val is equal to current

		// you didn't check that both previous and next are different to current

		// you didn't take maximum of previous or next for update

	}
}
