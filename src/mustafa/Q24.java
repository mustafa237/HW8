package mustafa;

public class Q24 {
	public void compute() throws Exception{
		throw new RuntimeException("Error");
	}

	public static void main(String[] args) 
							throws Exception 	// Added
	{
		try {
			new Q24().compute();
			System.out.print("Ping");
		} catch (NullPointerException e) {
			System.out.print("Pong");
			throw e;
		}

	}

}
