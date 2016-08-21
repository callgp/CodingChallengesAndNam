import java.util.Arrays;

public class TwoTwo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 1, 2, 2};
		System.out.println("is-->" +twoTwo(ar));
	}

	public static boolean twoTwo(int[] nums) {
		boolean result = true;
	        int consecutiveTwos = 0;
	        for(int num: nums){
			if(num == 2){ // found a two
				if(consecutiveTwos > 0){ // found twos adjacent to each other
					consecutiveTwos++;
	                                result = true;
	                        }
				else{ // found a single two
					consecutiveTwos = 1;
					result = false; 
				}
			}  
			else{ // found a number that was not a two 
				if(consecutiveTwos == 1){ // there was a single two
					result = false;
					break; // break out of for loop
				}
				else{
					consecutiveTwos = 0; // reset variable 
				}
			}
		}
	        return result;
	}
}
