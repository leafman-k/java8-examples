package comparison;

public class IntanceOfTest {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
		System.out.println("Parent instanceof Parent: "
	            + (parent instanceof Parent));
	    System.out.println("Parent instanceof Child: "
	            + (parent instanceof Child));
	    System.out.println("Parent instanceof MyInterface: "
	            + (parent instanceof MyInterface));
	    System.out.println("Child instanceof Parent: "
	            + (child instanceof Parent));
	    System.out.println("Child instanceof Child: "
	            + (child instanceof Child));
	    System.out.println("Child instanceof MyInterface: "
	            + (child instanceof MyInterface));
	}

}
