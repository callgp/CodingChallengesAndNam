
public class Test1 {
	public static int sumUnique(int a, int b, int c) {
		int result=0;
		 if (a == b&& b==c) {
				result= 0;

			}
		 else if (a == b) {
			result= c;

		} else if (b == c) {
			result=a;
		} else if (a == c) {
			result= b;
		}else if (a != b && b != c&&a!=c){
			result= a + b + c;
		}else {
			result=0;
		}
		return result;

	}

	
	public static void main(String args[]) {
		
		System.out.println("is-->"+sumUnique(1, 2, 3));//exp 6
		 System.out.println("is---->"+sumUnique(3, 2, 3) );//exp 2
		 System.out.println("is---->"+ sumUnique(3, 3, 3)); //exp0

	}

}
