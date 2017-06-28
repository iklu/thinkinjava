package holding_your_objects.adding_groups_of_elements;

import java.util.*;

import static util.Print.*;

/**
 * There are utility methods in both the Arrays and Collections classes in
 * java.util that add groups of elements to a Collection. Arrays.asList( ) takes
 * either an array or a comma-separated list of elements (using varargs) and
 * turns it into a List object. Collections.addAll( ) takes a Collection object
 * and either an array or a comma-separated list and adds the elements to the
 * Collection.
 * 
 * @author ovidiu.dragoi
 *
 */
public class AddingGroups {
	public static void main(String[] args) {
		
		//adding first time
		List<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		
		//create an array
		Integer[] moreInts = { 4, 8, 6 };
		
		//adding second time
		collection.addAll(Arrays.asList(moreInts));
		
		print(collection);
	}
}
