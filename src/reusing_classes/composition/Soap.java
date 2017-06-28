package reusing_classes.composition;
import static util.Print.*;

public class Soap {
	private String s;
	
	Soap(){
		print("Soap");
		s = "Constructed";
	}
	
	public String toString() { return s;}
}
