
public class Lucky13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lucky13([1, 2, 3]) → false	true
		int[] ar={1,2,3};
		System.out.println("value is-->"+lucky13(ar));

	}

	public static boolean lucky13(int[] nums) {

		boolean result = false;

		int sum = 0;
		for (int n : nums) {
			if (n != 1 || n != 3)
				return false;

		}
		return true;

	}

}
