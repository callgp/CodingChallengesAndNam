public class Sub extends Super2 {
    public Sub(int i) {
		// TODO Auto-generated constructor stub
    	System.out.println("in sub constructor");
	}

	public static void main(String[] args) {
        Sub sub = new Sub(5);
        sub.print();
    }
}