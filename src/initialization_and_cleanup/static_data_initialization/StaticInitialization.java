package initialization_and_cleanup.static_data_initialization;


/**
 * The static variables are initialized only once when the object is created
 * @author ovidiu.dragoi
 *
 */
public class StaticInitialization {
	
	static Table table = new Table();
	static Cupboard cupboard = new Cupboard();
	
	//try second time only a few are initialized
	static Table table1 = new Table();
	static Cupboard cupboard1 = new Cupboard();
	
	public static void main(String[] args) {
//		System.out.println("Creating new Cupboard() in main");
//		new Cupboard();
//		
//		System.out.println("Creating new Cupboard() in main");
//		new Cupboard();
////		
//		table.f2(1);
//		cupboard.f3(1);
	}


}
