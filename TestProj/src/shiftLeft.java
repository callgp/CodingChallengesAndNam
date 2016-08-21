import java.util.Arrays;

public class shiftLeft {

	public static void main(String[] args) {
	
		int[] ar={6, 2, 5, 3};
System.out.println("is=="+Arrays.toString(shiftLeft(ar)));
	}

	
	public static int[] shiftLeft(int[] nums) {
		  int len =nums.length;
		  int[] arr=new int[len];
		 // arr[len]=nums[0];
		  for(int i=0;i<len-1;i++){
			  
			  
			  
			  
			  
			  
		   
		    arr[i]=nums[i+1];
		  }
		  arr[len-1]=nums[0];
		  return arr;
		}
 
}
