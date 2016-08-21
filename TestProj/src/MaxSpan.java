
public class MaxSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] ar={1, 2, 1, 1, 3};
 System.out.println("value is"+maxSpan(ar));
	}

	
	public static int maxSpan(int[] nums) {
		int span=1;
		int counter=0;
	    if (nums.length>0) {
	    	for (int i = 0; i < nums.length; i++) {
				for (int k = nums.length-1; k >0; k--) {
					if(nums[k]==nums[i]){
						counter=k-i+1;
						if(counter>span){
							span=counter;
						}
						
					}
				}
			}
	    }
			
		 else {
			span=0;

		}
		return span;
		
}
}
