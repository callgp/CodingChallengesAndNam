import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WithouString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-->>is--->" + withoutString("Hello there", "llo"));
		System.out.println("-->>is--->" + withoutString("Hello there", "e"));
		System.out.println("-->>is--->" + withoutString("Hello there", "x"));
		System.out.println("-->>is--->" + withoutString("This is a FISH", "IS"));
		System.out.println("-->>is--->" + withoutString("THIS is a FISH", "is"));
		System.out.println("-->>is--->" + withoutString("THIS is a FISH", "iS"));
		System.out.println("-->>is--->" + withoutString("abxxxxab", "xx"));
		System.out.println("-->>is--->" + withoutString("abxxxab", "xx"));
		System.out.println("-->>is--->" + withoutString("abxxxab", "x"));
		System.out.println("-->>is--->" + withoutString("xxx", "x"));
		System.out.println("-->>is--->" + withoutString("xxx", "xx"));
		System.out.println("-->>is--->" + withoutString("xyzzy", "Y"));
		System.out.println("-->>is--->" + withoutString("", "x"));
		System.out.println("-->>is--->" + withoutString("abcabc", "b"));
		System.out.println("-->>is--->" + withoutString("AA22bb", "2"));
		System.out.println("-->>is--->" + withoutString("1111", "1"));
		System.out.println("-->>is--->" + withoutString("1111", "11"));
		System.out.println("-->>is--->" + withoutString("MkjtMkx", "Mk"));
		System.out.println("-->>is--->" + withoutString("Hi HoHo", "Ho"));
	}

	public static String withoutString(String base, String remove) {
		// return base.replaceAll(remove,"");

		Pattern p = Pattern.compile(remove, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(base);
		String s = m.replaceAll("");
		//return s.replaceAll("  ", " ");\
		return s;
	}

}
