import java.util.LinkedList;

public class Ghappy {

	public static void main(String[] args) {
		System.out.println("valuer is-->" + gHappy("xxggyygxx"));

	}

	public static boolean gHappy(String str) {

		boolean happy = true;
		//str = str + "|";

		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) == 'g' && !((str.charAt(Math.abs(i + 1)) == 'g' || str.charAt(Math.abs(i - 1)) == 'g'))) {
				happy = false;
			}

		}
		return happy;
	}
	/*
	 * public static boolean gHappy(String str) { boolean result = false; for
	 * (int i = 0; i <= str.length() - 1; i++) {
	 * 
	 * if(str.length()>2 &&(str.charAt(1)=='g'&&(str.charAt(0))) return true;
	 * 
	 * else if(str.length()>2
	 * &&((str.charAt(i)=='g')&&(str.charAt(i-1)=='g'||str.charAt(i-1)== 'g')))
	 * { return true; } } return false;
	 * 
	 * 
	 * 
	 * if (str.charAt(i) == 'g' && (str.charAt(i + 1) == 'g' || str.charAt(i -
	 * 1) == 'g')) { { if (str.charAt(i + 1) == 'g' && (str.substring(i + 1,
	 * str.length()).contains("gg"))) result = true;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * // else if(str.length()>2 && //
	 * str.charAt(i)=='g'&&(str.charAt(i-1)=='g'||str.charAt(i-1)=='g')) //
	 * return true;
	 * 
	 * // continue; }
	 * 
	 * }
	 * 
	 * } return result; }
	 */

	/*
	 * public boolean gHappy(String str) { for(int i=0;i<=str.length()-1;i++){
	 * if(str.length()==2&&str.charAt(1)=='g'&&(str.charAt(0))) return true;
	 * 
	 * else if(str.length()>2
	 * &&((str.charAt(i)=='g')&&(str.charAt(i-1)=='g'||str.charAt(i-1)=='g'))) {
	 * return true; } } return false;
	 * 
	 * }
	 */

}
