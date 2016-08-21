public class Child extends Parent{
    public Child(int i) {
		// TODO Auto-generated constructor stub
    	super();
    	super(4);
    	System.out.println("in Child constructor");
	}

	public static void main(String[] args) {
		Child ch = new Child(4);
        ch.print();
    }
}