package initialization_and_cleanup.enumerated_types;

public class EnumOrder {

	public static void main(String[] args) {
		for(Spiciness s : Spiciness.values())
			System.out.println(s + ", ordinal " + s.ordinal());
	}

}
