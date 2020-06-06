package mustafa;



public class Q9 {

	public static void main(String args[]) {
		try {
			System.out.print('A');
			throw new RuntimeException("Out of Bounds!");
		} catch (ArrayIndexOutOfBoundsException aioobe){
			System.out.print('B');
			throw aioobe; // variable name changed
		} finally {
			System.out.print('C');
		}
	}
}
