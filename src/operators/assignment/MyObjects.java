package operators.assignment;

public class MyObjects {
	public static void main(String[] args){
		String message = new String("hello");
		String anotherMessage = new String("bye");
		
		anotherMessage = message;
		
		System.out.println(anotherMessage);
	}
}
