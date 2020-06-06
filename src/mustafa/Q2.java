package mustafa;

public class Q2 {

	public static void main(String[] args) {
		try {
			System.out.print("First try, ");
			throw new Exception();
		} catch (Exception e) {
			System.out.print("then catch ");
		} finally {
			System.out.print("and finally..");
		}
	}

}
