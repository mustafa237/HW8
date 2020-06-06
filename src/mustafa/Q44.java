package mustafa;

@SuppressWarnings("serial")
class DragonException extends Exception {}


public class Q44 {
	@SuppressWarnings("finally")
	public void openDrawbridge() throws Exception { 
		try { 
			throw new Exception("This Exception"); 
		} catch (RuntimeException e) { 
			throw new DragonException(); 
		} finally { 
			throw new RuntimeException("Or maybe this one"); 
		}
	}
	public static void main(String[] args) {
		try {								//Added
			new Q44().openDrawbridge();
		} catch (Exception e) {				//Added
			e.printStackTrace();			//Added
		} 									//Added
	}

}
