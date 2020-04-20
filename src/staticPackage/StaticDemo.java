package staticPackage;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticExampleClass class1 = new StaticExampleClass("bmw");
		System.out.println("make of car is: " + class1.getMake());
		System.out.println("this is instance: " + class1.getInstance());
		
		

		StaticExampleClass class2 = new StaticExampleClass("benz");
		System.out.println("make of car is: " + class2.getMake());
		System.out.println("this is instance: " + class2.getInstance());
	}

}
