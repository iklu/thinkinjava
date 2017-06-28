package initialization_and_cleanup.thisobj;

public class Person {
	public void eat(Apple apple){
		Apple peeled = apple.getPeeled();
		System.out.println("Yummy");
	}
}
