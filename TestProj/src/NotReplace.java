import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NotReplace {
	public static void main(String[] args) {

		// System.out.println("is--->" + notReplace("is test"));
		// System.out.println(" is--->" + notReplace("is test"));

		System.out.println(" is--->" + notReplace("This is right"));
		/*
		 * System.out.println("is--->" + notReplace("This is isabell"));
		 * System.out.println(" is--->" + notReplace("")); System.out.println(
		 * " is--->" + notReplace("is")); System.out.println(" is--->" +
		 * notReplace("isis")); System.out.println("is--->" + notReplace(
		 * "Dis is bliss is")); System.out.println(" is--->" + notReplace(
		 * "is his")); System.out.println(" is--->" + notReplace("xis yis"));
		 */
		// System.out.println(" is--->" + notReplace("AAAis is"));
		// System.out.println(" is--->" + notReplace("is-is"));
	}

	public static String notReplace(String str) {
		/*
		 * String str2 = ""; for (int i = 0; i <= str.length() - 2; i++) if
		 * (str.substring(i - 1, i).equals(" ") && (str.substring(i, i +
		 * 2).equals("is"))) { str2 = str.replace("is", "is not"); }
		 */
		String result = "";
		String target = "is";
		String target2 = "is not";
		int len = str.length();
		// String result;
		// str = " " + str + " "; // avoid issues with corner cases
		for (int i = 0; i < len; i++) {/*
										 * if (str.charAt(i) == 'i') { if
										 * (str.charAt(i + 1) == 's' &&
										 * !Character.isLetter(str.charAt(i +
										 * 2)) &&
										 * !Character.isLetter(str.charAt(i -
										 * 1))) { result += "is not"; i += 1; }
										 * else result += "i"; } else result +=
										 * str.charAt(i);
										 */
			if ((str.charAt(i) == 'i')) {
				if ((str.charAt(i + 1) == 's')
						&& (!Character.isLetter(str.charAt(i + 2)) && !Character.isLetter(str.charAt(i - 1)))) {
					result = "is not";
					i++;
				}else {
					result=result+i;
					
				}
				/*result = str.replace(target, target2);
				System.out.println("str is in if loop-->" + str);
				i++;*/

			} else {
				result = str;
				System.out.println("in else...");

			}
			// return str;
		}
		return result;
	}

	/*
	 * public String notReplace(String str) { String result = ""; int len =
	 * str.length();
	 * 
	 * for(int i = 0; i < len; i++){ if(i-1 >= 0 &&
	 * Character.isLetter(str.charAt(i-1)) || i+2 < len &&
	 * Character.isLetter(str.charAt(i+2))) { result += str.charAt(i); } else
	 * if(i+1 < len && str.substring(i, i+2).equals("is")) { result += "is not";
	 * i++; } else result += str.charAt(i); } return result; }
	 */
}
