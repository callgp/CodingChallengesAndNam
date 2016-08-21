
public class Has77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 1, 7, 7 };
		System.out.println("value--->" + has77(ar));
	}

	public static boolean has77(int[] nums) {
		boolean res = false;

		for (int i = 0; i < nums.length - 2; i++) {

			if ((nums[i] == 7 && nums[i + 1] == 7) || (nums[i] == 7 && nums[i + 2] == 7)
					|| ((nums[i + 1]) == 7 && (nums[i + 2] == 7))) {

				res = true;
				return res;
			}
		}
		return res;
	}

}
