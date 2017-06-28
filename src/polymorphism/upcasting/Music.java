package polymorphism.upcasting;

public class Music {
	
	//UPCASTING
	public static void tune(Instrument i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute); // Upcasting
	}
}
