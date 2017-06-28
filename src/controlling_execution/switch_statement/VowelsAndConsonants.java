package controlling_execution.switch_statement;

import java.util.Random;

public class VowelsAndConsonants {
	
	 VowelsAndConsonants(String name){
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		
		new VowelsAndConsonants("This is the constructor");
		


		for (int i = 0; i < 100; i++) {
			
			int c = rand.nextInt(26) + 'a';
			
			System.out.println((char) c + ", " + c + ": ");
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("vowel");
				break;
			case 'y':
			case 'w':
				System.out.println("Sometimes a vowel");
				break;
			default:
				System.out.println(c);
				System.out.println("consonant");
			}
		}

	}

}
