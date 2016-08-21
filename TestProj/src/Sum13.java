
public class Sum13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 13, 1, 2, 13, 2, 1, 13 };
		System.out.println(sum13(ar));

	}

	// public static int sum13(int[] nums) {}
	public static int sum13(
			int[] nums) {/*
							 * int sum = 0; for (int i = 0; i < nums.length;
							 * i++) { if (nums[i] != 13) sum += nums[i]; else if
							 * (nums[i] == 13 && i < nums.length - 1) { nums[i]
							 * = 0; nums[i + 1] = 0; } } return sum;
							 
		int sum = 0;
		int sumBold = 0;
		if (nums[0] == 13&&nums[1]==13){
			sum=0;
		}
		for (int i = 0; i < nums.length; i++) {
			
			 * if (i<nums.length){ sum += nums[i]; System.out.println(
			 * "sum is-->"+sum); } else
			 
			sum += nums[i];
			System.out.println("sum is-->" + sum);
			
			if (nums[i] == 13)
				if (i>=2&& i < nums.length - 1) {
					sumBold += nums[i] + nums[i + 1];
					System.out.println("sumBold is-->" + sumBold);
				} 
				
				else {
					sumBold += nums[i];
					System.out.println("sumBold in else is-->" + sumBold);
				}
		}
		return (sum - sumBold);
	*/
		
		//public int sum13(int[] nums) {
		    int total = 0;
		    for (int i = 0; i < nums.length; i++) {
		        if (nums[i] != 13) total += nums[i];
		        else if (i <= nums.length - 1) i++;
		    }
		    return total;
		}
	}

