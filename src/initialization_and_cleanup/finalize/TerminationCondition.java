package initialization_and_cleanup.finalize;

public class TerminationCondition {

	public static void main(String[] args) {
		Book novel = new Book(true);
		// Proper cleanup:
		novel.checkIn();
		
		// Drop the reference, forget to clean up:
		new Book(true);
		// Force garbage collection & finalization:
		System.gc();
		
		Tank t = new Tank(false);
		System.gc();

	}

}
