package initialization_and_cleanup.overloading;

public class Tree {

	int height;
	
	public Tree() {
		System.out.println("Planting a seedling");
		height=0;
	}
	
	public Tree(int initialHeight) {
		height = initialHeight;
		System.out.println("Creating new Tree that is " + height + " feet tall");
	}
	
	public void info(){
		System.out.println("Tree is " + height + " feet tall");
	}
	
	public void info(String s) {
		System.out.println(s + ": Tree is " + height + " feet tall");
	}

}
