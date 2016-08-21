
public class CanBalance {
	public static void main(String[] args) {
	
		int[] ar1={2, 1, 1, 2, 1};
		System.out.println("canBalance value is--->"+canBalance(ar1));
	}	
	public static boolean canBalance(int[] nums) {
		  int leftTotal=0;		 
		  
		  for (int i = 0; i < nums.length; i++) {			
			  leftTotal=leftTotal+nums[i];
			  System.out.println("i is " + i + " leftTotal is " + leftTotal);
			  int rightTotal=0;
			  for (int j = nums.length-1; j >i; j--) {				 
				  rightTotal=rightTotal+nums[j];
				  System.out.println("j is " + j + " rightTotal is " + rightTotal);
			  }
				  if(leftTotal==rightTotal){
					  return true;
				  }				
			}			
				  
		  return false;
		}
}
