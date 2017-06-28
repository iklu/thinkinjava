package reusing_classes.initialization_with_inheritance;

import static util.Print.*;

public class Beetle extends Insect {
	private int k = printInit("Beetle.k initialized");
	private static int x2 = printInit("static Beetle.x2 initialized");
	

	public Beetle() {
		print("k = " + k);
		print("j = " + j);
	}
	
	public static void main(String[] args){
		print("Beetle constructor");
		Beetle beetle = new Beetle();
	}
	
}
