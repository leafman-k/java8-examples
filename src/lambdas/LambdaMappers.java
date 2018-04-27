package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaMappers {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Ali", 15));
		persons.add(new Person("Karin", 22));
		persons.add(new Person("Jose", 24));
		persons.add(new Person("Martin", 8));
		
		Predicate<Person> byAge = person -> person.getAge() > 18;
		List<Student> students = persons.stream().
				filter(byAge).
				map(person -> new Student(person)).collect(Collectors.toList());
		
		students.forEach(student -> System.out.println(student));
		
	}

}
