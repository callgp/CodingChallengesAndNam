import java.util.Arrays;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] ar={1, 0, 1, 0, 0, 1, 1};
        System.out.println("value-->"+Arrays.toString(evenOdd(ar)));
	}
	
	public static int[] evenOdd(int[] nums) {
		int len=nums.length;
		int[] arr=new int[len];
		int front=0;
		int back=len-1;
		  for(int i=0;i<nums.length;i++){		    
		    if(nums[i]%2==0){	
		    	arr[front]=nums[i];
		    	front++;
		    	
		  }
		  else if(nums[i]%2==1){
			  arr[back]=nums[i];
		    	back--;
		  }
		  }
		  return arr;
		}

		/*Another possible solution, would be to create a new array of the same size,
		loop through the original array, if the number is even fill the result array from the
		front, but if it is odd, fill the result array from the back. It does require a bit 
		extra memory to store an extra array plus you need 3 index variables... One for the main
		loop index, one to track where you are filling the result array from the front and one to 
		track where you are filling from the back. But the advantage is that you only need to 
		loop through the array once, whereas the other solutions loop through many times.
*/
}
