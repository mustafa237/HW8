package mustafa;

public class Q38 {
	class Organ {
		public void operate() throws RuntimeException {
			throw new RuntimeException("Not Supported");
		}
	}
	class Heart extends Organ {
		public void operate() 
				//throws Exception     // can not use broader exception here
		{
			System.out.print("beat");
		}
	}
	public static void main(String[] args) throws Exception {
		try {
			new Q38().new Heart().operate();
		} finally {
			
		}

	}

}
