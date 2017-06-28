package initialization_and_cleanup.finalize;

//: initialization/TerminationCondition.java
//Using finalize() to detect an object that
//hasn’t been properly cleaned up.
public class Book {
	boolean checkedOut = false;

	Book(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}

	void checkIn() {
		checkedOut = true;
	}

	protected void finalize() {
		System.out.println("finalize() called;");
		if (checkedOut)
			System.out.println("Error: checked out");
		// Normally, you’ll also do this:
		// super.finalize(); // Call the base-class version
	}
}
