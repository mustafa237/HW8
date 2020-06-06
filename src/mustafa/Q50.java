package mustafa;

public class Q50 {
	public static void snore() {
		try {
			String sheep[] = new String[3];
			System.out.print(sheep[3]);
		} catch (RuntimeException e) {
			System.out.print("Awake!");
		} finally {
			try {							//added
				throw new Exception();
			} catch (Exception e) {			//added
				e.printStackTrace();		//added
			}								//added
		}
	}
	public static void main (String... sheep) {
		snore();
	}
}
