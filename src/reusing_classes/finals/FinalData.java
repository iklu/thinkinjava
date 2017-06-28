package reusing_classes.finals;

import java.util.Random;
import static util.Print.*;

/**
 * When final is used with object references rather than primitives, the meaning
 * can be confusing. With a primitive, final makes the value a constant, but
 * with an object reference, final makes the reference a constant. Once the
 * reference is initialized to an object, it can never be changed to point to
 * another object. However, the object itself can be modified; Java does not
 * provide a way to make any arbitrary object a constant. (You can, however,
 * write your class so that objects have the effect of being constant.) This
 * restriction includes arrays, which are also objects.
 * 
 * @author ovidiu.dragoi
 *
 */
public class FinalData {

	private static Random rand = new Random(47);
	private String id;
	private final int valueOne = 9;
	private static final int VALUE_TWO = 99;
	// Typical public constant:
	public static final int VALUE_THREE = 39;
	// Cannot be compile-time constants:
	private final int i4 = rand.nextInt(20);
	static final int INT_5 = rand.nextInt(20);
	private Value v1 = new Value(11);
	private final Value v2 = new Value(22);
	private static final Value VAL_3 = new Value(33);
	// Arrays:
	private final int[] a = { 1, 2, 3, 4, 5, 6 };

	/**
	 * 
	 * @param id
	 */
	public FinalData(String id) {
		this.id = id;
	}

	/**
	 * just because v2 is final doesn’t mean that you can’t change its value.
	 * Because it’s a reference, final means that you cannot rebind v2 to a new
	 * object.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FinalData fd1 = new FinalData("fd1");
		// fd1.valueOne++; // Error: can’t change value
		fd1.v2.i++; // Object isn’t constant!

		for (int i = 0; i < fd1.a.length; i++)
			fd1.a[i]++; // Object isn’t constant!
		// ! fd1.v2 = new Value(0); // Error: Can’t
		// ! fd1.VAL_3 = new Value(1); // change reference
		// ! fd1.a = new int[3];
		print(fd1);
		print("Creating new FinalData");
		FinalData fd2 = new FinalData("fd2");
		print(fd1);
		print(fd2);
	}

	/**
	 * 
	 */
	public String toString() {
		return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
	}
}
