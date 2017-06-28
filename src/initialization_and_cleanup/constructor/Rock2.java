package initialization_and_cleanup.constructor;

public class Rock2 {

	public Rock2(int i) {
		System.out.print("Rock " + i + " ");
	}

	public static void main(String[] args) {
		for (int i = 0; i < 8; i++)
			new Rock2(i);

	}

}
