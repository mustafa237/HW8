package mustafa;



public class Q32 {
	class BigCat {
		void roar(int level) 
		throws 					// s was missing 
		RuntimeException {
			if (level < 3) throw new IllegalArgumentException();
			System.out.print("Roar!");
		}
	}
	class Lion extends BigCat{ 
		public void roar() { // m2 
			System.out.print("Roar!!!");
		}
	}
	   //  
	public static void main(String[] args) {
		final BigCat kitty = new Q32().new Lion();
		kitty.roar(2);
	}

	

}
