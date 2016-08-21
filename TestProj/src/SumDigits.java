public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Given a string, return the sum of the digits 0-9 that appear in the
		 * string, ignoring all other characters. Return 0 if there are no
		 * digits in the string. (Note: Character.isDigit(char) tests if a char
		 * is one of the chars '0', '1', .. '9'. Integer.parseInt(string)
		 * converts a string to an int.)
		 * 
		 * sumDigits("aa1bc2d3") ? 6 sumDigits("aa11b33") ? 8
		 * sumDigits("Chocolate") ? 0
		 */
		System.out.println("i is-->" + sumDigits("aa1bc2d3"));
		System.out.println("i2 is-->" + sumDigits("Chocolate"));

	}

	public static int sumDigits(String str) {

		/*
		 * char[] array = reader.toCharArray(); for (char ch : array) {
		 * System.out.println (ch);
		 */
		/*
		 * for (char ch: str.toCharArray()) {
		 * 
		 * 
		 * 
		 * for (int i = 0; i < str.length() - 1; i++) { if
		 * ((Character.isDigit(ch[i])){ return 1; }
		 */

		// String s = "xyz";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) {
				sum = sum + Integer.parseInt(String.valueOf(c));
			}
		}
		return sum;

		// if (str.charAt(i) =='2')){
		// return 1;
		// }
		//
		// if(str.charAt(i)=='3')){return 1;
		// }
		// else{
		// return 0;
		// }
		// }

	}

}