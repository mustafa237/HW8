package mustafa;

public class Q17 {
	@SuppressWarnings("serial")
	class CapsizedException extends Exception {}
	class Boat {
		public int travel() throws Exception { return 4; };
	}
	public static void main(String[] args) throws Exception {
		try {
			System.out.print(new Q17().new Boat().travel());
		} catch (Exception e) {
			System.out.print(8);
		}

	}

}
