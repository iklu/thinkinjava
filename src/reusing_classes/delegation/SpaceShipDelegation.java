package reusing_classes.delegation;

/**
 * A third relationship, which is not directly supported by Java, is called
 * delegation. This is midway between inheritance and composition, because you
 * place a member object in the class you’re building (like composition), but at
 * the same time you expose all the methods from the member object in your new
 * class (like inheritance).
 * 
 * You can see how the methods are forwarded to the underlying controls object,
 * and the interface is thus the same as it is with inheritance. However, you
 * have more control with delegation because you can choose to provide only a
 * subset of the methods in the member object. Although the Java language
 * doesn’t support delegation, development tools often do. The above example,
 * for instance, was automatically generated using the JetBrains Idea IDE.
 * 
 * @author ovidiu.dragoi
 *
 */
public class SpaceShipDelegation {
	private String name;
	private SpaceShipControlls controls = new SpaceShipControlls();

	public SpaceShipDelegation(String name) {
		this.name = name;
	}

	// Delegated methods:
	public void back(int velocity) {
		controls.back(velocity);
	}

	public void down(int velocity) {
		controls.down(velocity);
	}

	public void forward(int velocity) {
		controls.forward(velocity);
	}

	public void left(int velocity) {
		controls.left(velocity);
	}

	public void right(int velocity) {
		controls.right(velocity);
	}

	public void turboBoost() {
		controls.turboBoost();
	}

	public void up(int velocity) {
		controls.up(velocity);
	}

	public static void main(String[] args) {
		SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
		protector.forward(100);
	}
}
