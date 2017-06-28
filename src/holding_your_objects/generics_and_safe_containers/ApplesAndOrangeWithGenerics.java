package holding_your_objects.generics_and_safe_containers;
import java.util.*;

public class ApplesAndOrangeWithGenerics {
	public static void main(String[] args){
		List<Apple> apples = new ArrayList<>();
		for(int i = 0; i < 3; i++)
			apples.add(new Apple());
			// Compile-time error:
			// apples.add(new Orange());
			for(int i = 0; i < apples.size(); i++)
			System.out.println(apples.get(i).id());
			// Using foreach:
			for(Apple c : apples)
			System.out.println(c.id());
	}
}
