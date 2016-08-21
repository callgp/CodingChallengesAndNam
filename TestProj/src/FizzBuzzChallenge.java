import java.util.Arrays;

public class FizzBuzzChallenge {
	public static void main(String[] args) {
		System.out.println("value is-->"+Arrays.toString(fizzBuzz(50, 56)));
	}

	public static String[] fizzBuzz(int start, int end) {
		int len =end-start;
		  String [] arr=new String[(len)];
		  for(int k=start;k<(end);k++){
		    arr[k-start]=String.valueOf(k);
		  }
		  for(int i=0;i<(len);i++){ 
		  if(  (Integer.parseInt(arr[i]) ) %3==0){
		    arr[i]="Fizz";
		  }
		 else if((Integer.parseInt(arr[i]) )%5==0){
		    arr[i]="Buzz";
		  }
		 else if( (Integer.parseInt(arr[i]) )%3==0  && (Integer.parseInt(arr[i]) )%5==0){
			    arr[i]="FizzBuzz";
			  }
		  }
		  return arr;
		}

}
