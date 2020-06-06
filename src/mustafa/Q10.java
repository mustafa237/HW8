package mustafa;

public class Q10 {
	public void openDrawbridge() throws Exception {
		try {
			throw new Exception("Circle");
		} catch (Exception e) {
			System.out.print("Opening!");
		} finally {
			System.out.print("Walls");
		}
	}
	public static void main(String[] args) {
		try {							// Added
			new Q10().openDrawbridge();							
		} catch (Exception e) {			// Added
			e.printStackTrace();		// Added
		}								// Added
	}

}
