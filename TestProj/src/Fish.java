
public class Fish extends Animal{

	public Fish(String name, int weight, int height, String eyecolor) {
		super(name, weight, height, eyecolor);
		// TODO Auto-generated constructor stub
	}

	public void swiM(){
		System.out.println("swimming fishiie");
	
}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("fish moviing swimmin");
		
	}
}
