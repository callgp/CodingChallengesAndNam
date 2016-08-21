import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection {

	/*
	 * Write a Java function that has for its input a Collection of Integers.
	 * The function iterates through the Collection and outputs the following
	 * (either to console or to a file): 1. If the Integer is divisible by 6,
	 * display "Six" 2. If the Integer is divisible by 5 display "Five" 3. If
	 * the Integer is divisible by 6 and 5 display "SixFive" 4. If the Integer
	 * is not divisible by either 6 or 5 then display the Integer itself. The
	 * function should also return a Collection of Integers that are NOT
	 * divisible by 6 or 5.
	 */
	public static void main(String args[]) {
		int count[] = { 6, 5, 30, 31, 30, 22 };
		Set<Integer> set = new HashSet<Integer>();
		System.out.println("value-->"+testCollection(set));
		
		
	}
	
	
	

	private static String testCollection(Set<Integer> set) {

		/*int count[] = { 6, 5, 30, 31, 30, 22 };
		Set<Integer> set = new HashSet<Integer>();*/
		
		try {
			
			for (int i = 0; i < 6; i++) {
				set.add(count[i]);
				if (count[i] % 6 == 0 && count[5] == 0) {
					System.out.println("divisible by 6 and 5 ");

				} else if (count[i] % 5 == 0) {
					System.out.println("divisible by 5 ");
				} else if (count[i] % 6 == 0) {
					System.out.println("divisible by 6");

				} else {
					System.out.println("not divisible by 5 or 6");
				}
				set.add(count[i]);
			}

			System.out.println(set);

		} catch (Exception e) {
		}
	return null;
	}
}
