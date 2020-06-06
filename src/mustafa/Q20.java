package mustafa;

public class Q20 {
	@SuppressWarnings("serial")
	class GasException extends Exception {}
	class Element {
		public int getSymbol() throws GasException { return -1; }
	}
	class Oxygen extends Element {
		public int getSymbol() { return 8; }
		public void printData() {
			try {
			System.out.print(getSymbol());
			
			} catch 
			(Exception e) 					// Added missing part
			{
			System.out.print("Unable");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
