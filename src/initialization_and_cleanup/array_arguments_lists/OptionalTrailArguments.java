package initialization_and_cleanup.array_arguments_lists;

public class OptionalTrailArguments {
	static void f(int required, String... trailing) {
		System.out.print("required: " + required + " ");
		for(String s : trailing)
		System.out.print(s + " ");
		System.out.println();
		}
		public static void main(String[] args) {
		f(1, "one");
		f(2, "two", "three");
		f(0);
	}
}
