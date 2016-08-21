
public class CountXy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("valur===>"+countYZ("fez day"));
		
	}

	public static int countYZ(String str) {
		  int k = 0;
		  System.out.println("leng-->"+str.length());

		  str=str.toLowerCase()+" ";
				for (int j = 1; j < str.length()-1; j++) {
					if ( ( (str.charAt(j)=='y') ||  (str.charAt(j)=='z'))    && !Character.isLetter(str.charAt(j + 1) )){
						k++;
					}
				}
				
				return k;
			}
			
			

	
}
