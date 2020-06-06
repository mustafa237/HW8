package mustafa;

public class Q5 {

	public static void main(String[] args) {
		int score = 1;  // Moved out of try block
		try {
			
			System.out.print(score++);
		} catch (Throwable t) {
			System.out.print(score++);
		} finally {
			System.out.print(score++);
		}
		System.out.print(score++);
	}

}
