package access_controll;

public class Sundae {
	private Sundae() {
	}
	
	static Sundae makeASundae() {
		return new Sundae();
	}
}
