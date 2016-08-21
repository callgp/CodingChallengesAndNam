import java.util.Arrays;

public class Post4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 1, 0,8 };
		System.out.println("value is" + Arrays.toString(post4(arr)));
	}

	public static int[] post4(int[] nums) {
	int len = nums.length;
	int val = 0;
	for (int i = len-1; i >=0; i--) {
		if (nums[i] == 4) {
			val = i;
			break;
		}
	}
	int val2=len-(val+1);
	int[] arr = new int[val2];
	for (int k = (val+1); k < len; k++) {
		arr[k-(val+1)] = nums[k];
	}

	return arr;
	}
	
	/*public int[] pre4(int[] nums) {
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
*/

}
