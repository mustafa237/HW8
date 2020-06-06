package mustafa;

public class Q43 {
	public static void dancing() throws RuntimeException { 
		try { 
			throw new IllegalArgumentException(); 
		} catch (
				Error
				e  // e variable_name was missing
				) { 
			System.out.print("Unable!"); 
		} 
	} 
	
	public static void main(String... count) throws RuntimeException { 
		dancing(); 
	} 
}
