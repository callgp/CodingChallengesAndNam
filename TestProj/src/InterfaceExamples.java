import java.util.ArrayList;
import java.util.List;

public class InterfaceExamples {
	
public static void main(String[] args) {
		Flyables f=new Birds();
		//System.out.println();
		f.fly();
}
}
	
	interface Flyables{
		void fly();
	}
	
	class Aeroplane implements Flyables{
		public void fly() {
			//List arraylis=new ArrayList();
			System.out.println("eppie flyeing");
		}
	}

	
	class Birds implements Flyables {
		public void fly() {
			System.out.println("birdie flying");
		}
	}

	

