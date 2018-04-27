package lambdas;

public class BaseBall{

	public static void main(String[] args)
	 {
	  
	  Ball b = message -> { System.out.println(message); };
	  b.hit("ou hit it!");
	 }

}
