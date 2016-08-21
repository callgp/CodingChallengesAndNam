public class EqualIsNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("value-->" + equalIsNot("This is notnot"));
		/*
		 * System.out.println("value-->"+equalIsNot("This is notnot"));
		 * System.out.println("value-->"+equalIsNot("noisxxnotyynotxisi"));
		 * System.out.println("value-->"+equalIsNot("xxxyyyzzzintint"));
		 * System.out.println("value-->"+equalIsNot("This is notnot"));
		 * System.out.println("value-->"+equalIsNot("This is notnot"));
		 * System.out.println("value-->"+equalIsNot("This is notnot"));
		 */
	}

	/**
	 * @param str
	 * 
	 *            Given a string, return true if the number of appearances of
	 *            "is" anywhere in the string is equal to the number of
	 *            appearances of "not" anywhere in the string (case sensitive).
	 * 
	 *            equalIsNot("This is not") → false equalIsNot("This is notnot")
	 *            → true equalIsNot("noisxxnotyynotxisi") → true
	 * @return
	 */
	public static boolean equalIsNot(String str) {
		boolean result = false;
		int countIs = 0;
		int countNot = 0;
		System.out.println("len is====>" + str.length());
		for (int i = 0; i <= str.length() - 2; i++) {

			if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
				countIs++;
				System.out.println("countIs is====>" + countIs);

			}

		}

		for (int j = 0; j <= str.length() - 3; j++) {
			if (str.charAt(j) == 'n' && str.charAt(j + 1) == 'o' && str.charAt(j + 2) == 't') {
				countNot++;
				System.out.println("countNot is====>" + countNot);
			}

		}

		if (countIs == countNot) {
			// System.out.println("countIs is 000-->"+countIs);
			// System.out.println("countNot is 000-->"+countNot);
			return true;
		}

		return false;
	}
}