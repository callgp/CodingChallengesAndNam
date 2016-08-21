
public abstract class Animal {
	String name;
	int weight;
	int height;
	String eyecolor;
	
/*	public Human(){
		name = "pra";
		eyecolor = "brown";
		height = 180;
		weight = 70;
	}*/
	
	public void speak(){
		System.out.println("blah blah");
		System.out.println("blah blah name"+name);
		System.out.println("blah blah weight"+weight);
		System.out.println("blah blah height"+height);
		System.out.println("blah blah eye"+eyecolor);
	}
	public Animal(String name, int weight, int height, String eyecolor) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.eyecolor = eyecolor;
	}
	public void eat(){
		System.out.println("EATY ANIE");
		
	}
public void sleep(){
	System.out.println("slwwpy ANIE");
		
	}
public void swim(){
	System.out.println("SWIMMIE ANIE");
	
}
public abstract void move();

	
	

}
