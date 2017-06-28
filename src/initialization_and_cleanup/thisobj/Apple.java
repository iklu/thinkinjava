package initialization_and_cleanup.thisobj;

public class Apple {
	public Apple getPeeled() {
		return Peeler.peel(this);
	}
}
