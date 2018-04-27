package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();
		products.add(new Product("Ball", 15.5));
		products.add(new Product("AirPlane", 100005.2));
		products.add(new Product("Car", 150.5));
		products.add(new Product("Horse", 22.5));
		
		Predicate<Product> byPrize = product -> product.getPrice() > 20;
		
		List<Product> filtered = products.stream().filter(byPrize).collect(Collectors.<Product>toList());
		filtered.forEach(product -> System.out.println(product));
		
		filtered.forEach(product -> product.setPrice(product.getPrice() * 1.2));
		filtered.forEach(product -> System.out.println(product));
	}

}
