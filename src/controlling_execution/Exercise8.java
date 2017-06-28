package controlling_execution;

public class Exercise8 {
	public static void main(String[] args) {
		int checkNumber = 5;
		
		switch(checkNumber) {
		case 5:
			System.out.println("true (case first block)");
		case 2:
			System.out.println("true");
		case 4:
			System.out.println("true");
		}
	}
}
