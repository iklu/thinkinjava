package initialization_and_cleanup.static_data_initialization;

class Cupboard {
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	static Bowl bowl5 = new Bowl(5);

	Cupboard() {	
		System.out.println("Cupboard()");
		bowl4.f1(2);
		System.out.println();
	}

	void f3(int marker) {
		System.out.println("f3(" + marker + ")");
	}

}
