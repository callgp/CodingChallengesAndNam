
public class Bigiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar={2,10};
        System.out.println("values is-->"+bigDiff(ar));
	}

	
	public static int bigDiff(int[] nums) {
		  
		int max=nums[0];
		int min=nums[0];
		for(int i=0;i<nums.length;i++){
		if(max<=nums[i]){
		  max=nums[i];
		}

		if(min>=nums[i]){
		  min=nums[i];
		}
		}
		return max-min;
		}

}
