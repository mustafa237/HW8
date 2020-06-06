package mustafa;


public class Q1 {
	
	
	public static void think() throws Exception {
		try {	
			throw new Exception();
		} 
		catch (Exception e){} 		// Added
		
		
	}
	public static void main(String[] args) throws Exception {
		think();
		
	}
	

	
}
