package lambdas;

public class Calculator {
	
	interface IntegerMath{
		int operation(int a, int b);
	}

	public int operateBinary(int a, int b, IntegerMath op) {
		return op.operation(a, b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator myCalc = new Calculator();
		
		IntegerMath addition = (a, b) -> a + b;
		IntegerMath substraction = (a, b) -> a - b;
		
		System.out.println("Addition: " + myCalc.operateBinary(20, 10, addition));
		System.out.println("Subtraction: " + myCalc.operateBinary(20, 10, substraction));

	}

}
