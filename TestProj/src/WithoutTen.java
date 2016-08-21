
public class WithoutTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] withoutTen(int[] nums) {
		  int[] result = null;
		  for(int i=0;i<nums.length;i++){
		    if(nums[i]!=10){
		      result=nums;
		    }
		    
		     else if(nums[i]==10){
		      nums[i]=10;
		    }
		  }
		  return result;
		}

}
