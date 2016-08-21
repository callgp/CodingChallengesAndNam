import java.util.Arrays;

public class FizzArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("fizzArray is-->"+fizzArray(4).toString());
		System.out.println("fizzArray is-->"+Arrays.toString(fizzArray(4)));

	}

	
	public static int[] fizzArray(int n) {
		 // int size=n;
		  int[] ar=new int[n];
		  for(int i=0;i<n;i++){
		    ar[i]=i;
		  }
		  
		  return ar;
		}

}
