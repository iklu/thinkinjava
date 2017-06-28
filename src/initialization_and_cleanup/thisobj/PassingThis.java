package initialization_and_cleanup.thisobj;

public class PassingThis {
	public static void main(String[] args) {
		new Person().eat(new Apple());
	}
}
