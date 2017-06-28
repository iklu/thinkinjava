package initialization_and_cleanup.finalize;

public class Tank {
	boolean empty = false;
	
	Tank(boolean empty) {
		this.empty = empty;
	}
	
	public void emptyTank() {
		empty=true;
	}
	
	protected void finalize(){
		System.out.println("final");
	}
}
