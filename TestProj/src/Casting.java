
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived drv = new Derived();

		Base base = (Base) drv;

		System.out.println("Class : " + base.getClass()); 

		
	}

}
