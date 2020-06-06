package mustafa;

interface Source { 
	void flipSwitch() throws Exception; 
}


public class Q47 implements Source { 
	public void flipSwitch() { 
		try { 
			throw new RuntimeException("Circuit Break!"); 
		} finally { 
			System.out.print("Flipped!");
		}
	}

	public static void main(String[] args) throws Throwable {
		final Source bulb = new Q47();
		bulb.flipSwitch();

	}

}
