import java.util.Arrays;
import java.util.List;

public class LinearIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] outer = { 1, 2, 4, 6 };
		int[] inner = { 2, 4 };
		System.out.println("is-->" + linearIn(outer, inner));
	}

	public static boolean linearIn(int[] outer, int[] inner) {
		List o = Arrays.asList(outer);
		List i = Arrays.asList(inner);
		if (o.containsAll(i)) {
			return true;
		} else
			return false;
	}

}
