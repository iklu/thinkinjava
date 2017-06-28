package reusing_classes.inheritance;

import static util.Print.*;

public class Detergent extends Cleanser {
	// Change a method:
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub(); // Call base-class version
	}

	// Add methods to the interface:
	public void foam() {
		append(" foam()");
	}

	// Test the new class:
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		print("Testing base class:");
		Cleanser.main(args);
	}
}
