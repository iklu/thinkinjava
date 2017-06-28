package holding_your_objects.generics_and_safe_containers;

import java.util.*;

public class ApplesAndOrangeWithoutGenerics {

	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		ArrayList apples = new ArrayList();
		for(int i=0; i<3; i++)
			apples.add(new Apple());
		
		apples.add(new Orange());
		
		for(int i=0; i< apples.size(); i++)
			((Apple)apples.get(i)).id();

	}

}
