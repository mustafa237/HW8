package mustafa;

@SuppressWarnings("serial")
class CastleUnderSiegeException extends Exception {}
@SuppressWarnings("serial")
class KnightAttackingException extends CastleUnderSiegeException{}


public class Q22 {
	@SuppressWarnings("finally")
	public void openDrawBridge() throws RuntimeException, CastleUnderSiegeException{
		try{
			throw new KnightAttackingException();
		} catch(Exception e){
			System.out.println("B");
			throw new ClassCastException();
		} finally {
			throw new CastleUnderSiegeException(); 		// includes Checked exceptions thats why throws declarations were added
		}
	}
	public static void main(String[] args) throws RuntimeException, CastleUnderSiegeException {
		
			new Q22().openDrawBridge();
		
	}
}