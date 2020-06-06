package mustafa;

public class Q25 {
	//private boolean[] list = null; //NullPointerException
	private boolean[] list = {true,false,true}; // ArrayIndexOutOfBoundsException
	public int  printTodaysCount() {
		int count = 0;
		for (int i=0; i<10; i++) {
			if(list[i]) ++count;
		}
		return count;
	}
	public static void main(String[] args) {
		new Q25().printTodaysCount();

	}

}
