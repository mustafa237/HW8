package mustafa;

public class Q11 {

	public static void nullPointer() {
		throw new NullPointerException(); 	// Unchecked exception
	}
	public static void runtime() {
		throw new RuntimeException();		// Unchecked exception
	}
	public static void arithmetic() {
		throw new ArithmeticException();	// Unchecked exception
	}
	public static void exception() {
		try {
			throw new Exception();  		// Contains checked exceptions
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		

	}

}
