package mustafa;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Q14 {
	@SuppressWarnings("hiding")
	public void print() {
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) { 	//Changed the order
			System.out.print("X");
		} catch (IOException e) {				//Changed the order
			System.out.print("Z");
		}  finally {
			System.out.print("Y");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Q14().print();
	}

}
