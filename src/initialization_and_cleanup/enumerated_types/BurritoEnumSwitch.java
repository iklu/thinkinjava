package initialization_and_cleanup.enumerated_types;

public class BurritoEnumSwitch {

	Spiciness degree;

	BurritoEnumSwitch(Spiciness degree) {
		this.degree = degree;
	}

	public void describe() {
		switch (degree) {
		case NOT:
			System.out.println("Not spicy at all");                                  
			break;
		case MILD:
		case MEDIUM:
			System.out.println("a little hot");
			break;
		default:
			System.out.println("maybe too hot");
		}
	}

	public static void main(String[] args) {
		BurritoEnumSwitch plain = new BurritoEnumSwitch(Spiciness.NOT), 
				greenChile = new BurritoEnumSwitch(Spiciness.MEDIUM),
				jalapeno = new BurritoEnumSwitch(Spiciness.HOT);
		plain.describe();
		greenChile.describe();
		jalapeno.describe();

	}

}
