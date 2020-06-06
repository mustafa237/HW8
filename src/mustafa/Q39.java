package mustafa;

public class Q39 {
	public static void ignoreNullPointer() {
		throw new NullPointerException();
	}
	public static void handleNullPointer() {
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.print("Handled!");
		}
	}
	public static void main(String[] args) {
		handleNullPointer();

	}

}
