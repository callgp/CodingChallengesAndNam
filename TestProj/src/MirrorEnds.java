
public class MirrorEnds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("value is-->"+mirrorEnds("aba"));
		System.out.println("value is-->"+mirrorEnds("abca"));
	}
	
	public static String mirrorEnds(String string) {
	    String result = "";
	    int len = string.length();
	    for (int i = 0, j = len - 1; i < len; i++, j--)
	        if (string.charAt(i) == string.charAt(j))
	            result += string.charAt(i);
	        else break;
	    return result;
	}

}
