import java.util.ArrayList;

abstract class Animals{
	String name;
	abstract String bark();
}

class Dog extends Animals{

	@Override
	String bark() {
		// TODO Auto-generated method stub
		return "Bow Bow";
	}
	//String name;
	
}

class Cat extends Animals{

	@Override
	String bark() {
		// TODO Auto-generated method stub
		return "mm";
	}
	//String name;
}

class Dummy{
	
}

public class InheritanceExamples {
	public static void main(String[] args) {
		//Animals animals=new Animals();
		Dog dog=new Dog();
		dog.name="puppppy";
		ArrayList e=new ArrayList();
		Animals an=new Cat();
		System.out.println("===>"+an.bark());
		
	}

}
