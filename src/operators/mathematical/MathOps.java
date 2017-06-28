package operators.mathematical;
import java.util.*;

public class MathOps {
	public static void main(String[] args){
		double speed = 0;		
		long time = 120;
		double distance = 108.35;
		speed = distance/time;
		System.out.println(speed);
		
		
		// Uppercase and lowercase ‘e’ are the same:
		float expFloat = 1.39e-43f;
		expFloat = 1.39E-43f;
		System.out.println(expFloat);
	}
}
