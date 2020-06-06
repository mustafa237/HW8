package mustafa;

@SuppressWarnings("serial")
class Problem 
		//implements 		// wrong keyword
		extends
			RuntimeException {} 


@SuppressWarnings("serial")
public class Q46 extends Problem { //As bigger problem

	public static void main(String[] args) {
		try { 
			throw new Q46(); 
		} catch (Q46 re) { 
			System.out.print("Problem?"); 
		} catch (Problem e) { 
			System.out.print("Handled"); 
		} finally { 
			System.out.print("Fixed!");
		}

	}

}
