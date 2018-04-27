package inheritance;

public class Cat extends Animal {

	public static void testClassMethod() {
		System.out.println("This is static method of Cat");
	}
	public void testInstanceMethod() {
		System.out.println("This is instance method of Cat");
	}
	public static void main(String[] args) {
	
		Cat myCat = new Cat();
		Cat.testClassMethod();
		myCat.testInstanceMethod();
		Animal myAnimal = myCat;
		Animal.testClassMethod();
		myAnimal.testInstanceMethod();
	}
}
