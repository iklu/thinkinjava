package initialization_and_cleanup.member_initialization;

public class MethodInit {
	
	int i = f();
	
	/**
	 * a method to provide an initialization value
	 * @return
	 */
	public int f() {
		return 11; 
	}
}
