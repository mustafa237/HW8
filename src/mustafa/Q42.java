package mustafa;
@SuppressWarnings("serial")
class OutOfBoundsException extends BadCatchException {} 
@SuppressWarnings("serial")
class BadCatchException extends Exception {} 
interface Outfielder { 
	public void catchBall() throws OutOfBoundsException; 
} 

public class Q42 implements Outfielder{
	public void catchBall() throws OutOfBoundsException {} // void override
	//public int catchBall() throws OutOfBoundsException {}
	//public int catchBall() throws BadCatchException {}
	//public int catchBall() throws Exception {}
	
	// int return type is not compatible with void

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
