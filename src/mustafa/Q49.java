package mustafa;

import java.io.*;

public class Q49 {
	public void performBackup() { 
		try { 
			throw new IOException("Disk not found"); 
		} catch (Exception e) { 
			try { 
				throw new FileNotFoundException("File not found"); 
			} catch (FileNotFoundException 
					ffe  // e changed for conflicting variable name
					) { 
				System.out.print("Failed"); 
			} 
		}
	}
	 

	public static void main(String[] args) {
		new Q49(). performBackup(); 

	}

}
