import java.util.Arrays;

public class WithoutTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar={0, 2, 0};
		int[] ar2={10, 13, 10, 14, 10};
		System.out.println("value is--->"+Arrays.toString(withoutTen(ar)));
		System.out.println("value two is--->"+Arrays.toString(withoutTen(ar2)));

	}
	
	public static int[] withoutTen(int[] nums) {
		 int len=nums.length;
			int[] arr=new int[len];
		  int[] result=null;
		  for(int i=0;i<nums.length;i++){
		    if(nums[i]!=10){
		      result=nums;
		    }
		    
		     else if(nums[i]==10){
		      nums[i]=0;
		      
		      
		     
				int front=0;
				int back=len-1;
				  for(int z=0;z<nums.length;z++){		    
				    if(nums[z]%2==1){	
				    	arr[front]=nums[z];
				    	front++;
				    	
				  }
				  else if(nums[z]%2==0){
					  arr[back]=nums[z];
				    	back--;
				  }
				  }
		    }
		  }
		  //return result;
		  
		  
		  
				
				  return arr;
				
		  
}

}
