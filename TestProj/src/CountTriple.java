
public class CountTriple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("value is"+countTriple("222abyyycdXXX"));

	}

	
	public static int countTriple(String str) {
		  int count=0;
		  for(int i=0;i<str.length()-2;i++){
		  if(String.valueOf(str.charAt(i)).equals(String.valueOf(str.charAt(i+1)))&&String.valueOf(str.charAt(i+1)).equals(String.valueOf(str.charAt(i+2)))){
		    count++;
		  }
		  }
		  return count;
		}

}
