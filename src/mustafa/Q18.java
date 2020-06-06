package mustafa;

@SuppressWarnings("serial")
class PrintException extends Exception {}
@SuppressWarnings("serial")
class PaperPrintException extends PrintException {}

interface Printer {
	abstract int printdata() throws PrintException;
}

public class Q18 implements Printer {
	public int printdata() throws PaperPrintException{return 1;}
	//public int printdata() throws PrintException{return 1;}
	//public int printdata() throws Exception{return 1;} // cant throws Exception -> broader
	
	
	public static void main(String[] args) {
		

	}

}
