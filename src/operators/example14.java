package operators;

public class example14 {
	public static void main(String[] args) {
		AllOps operation = new AllOps();
		System.out.println(operation);
		
		String firstname = "ovidiu";
		String lastname = "ovidi";
		
		System.out.println(firstname.equals(lastname));
		System.out.println(firstname==lastname?true:false);
	}
}
