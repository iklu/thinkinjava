package holding_your_objects.generics_and_safe_containers;

import java.util.*;

public class Apple {
	private static long counter;
	private final long id = counter++;

	public long id() {
		return id;
	}
}
