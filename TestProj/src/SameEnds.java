
public class SameEnds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar={5, 6, 45, 99, 13, 5, 6};
		int len =2;
		System.out.println(sameEnds(ar,len));

	}
	
public static boolean sameEnds(int[] nums, int len) {
		  
		boolean result=true;

		for(int i=0;i<len;i++){
		  
		  if(nums[i]!=nums[((len-len)+i)] ){
		    result=false;
		  }
		  else {
		    result=true;
		  }
		}
		return result;
		  
		
}


}
