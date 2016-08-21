
public class Sum67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] ar = { 1, 2, 2, 6, 99, 99, 7, 3, 9 };
		// int[] ar = {1, 1, 6, 2, 3, 4, 5, 8, 9, 7, 1};//sixPos 2 sevenPos 9
		int[] ar = { 1, 2, 2 };// sixPos 0 sevenPos 0
		int[] ar1 = {1, 1, 6, 2, 3, 4, 5, 8, 9, 7, 1}
		System.out.println("value is" + sum67(ar1));

	}

	public static int sum67(int[] nums) {
		/*
		 * If the current element is a 6, set the boolean to true.
		If the boolean is false, add the current element to the sum.
		If the current element is a 7, set the boolean to false.*/
		int sum=0;
		boolean blockInd=false;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==6){
				blockInd=true;
			}
			if(blockInd==false){
				sum+=nums[i];
			}
			if(nums[i]==7){
				blockInd=true;
			}
			
			
		}
		return sum;
	}

}
