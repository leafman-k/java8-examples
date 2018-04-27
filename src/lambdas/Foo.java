package lambdas;

import java.util.function.Function;

public class Foo {

	public static void main(String[] args) {
		Foo useFoo = new Foo();
		Function<String, String> fn = 
				  parameter -> parameter + " from lambda";
		String result = useFoo.add("Message ", fn);
		System.out.println(result);

	}
	public String add(String string, Function<String, String> fn) {
	    return fn.apply(string);
	}
}
