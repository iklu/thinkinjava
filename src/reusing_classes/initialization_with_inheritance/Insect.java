package reusing_classes.initialization_with_inheritance;

import static util.Print.*;

public class Insect {
	private int i = 9;
	protected int j;
	private static int x1 = printInit("static Insect.x1 initialized");
	
	Insect() {
		print("i = " + i + ", j= " + j);
		j = 39;
	}
	
	static int printInit(String s) {
		print(s);
		return 47;
	}
	
}
