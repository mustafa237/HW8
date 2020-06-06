package mustafa;

abstract class Duck{
	protected int count;
	public abstract int getDuckies();
}

public class Q30 extends Duck {
	private int age;
	public  Q30 (int age) {
		this.age = age;
	}
	public int getDuckies() {
		
		return this.age / count;
	}
	
	
	public static void main(String[] args) {
		Duck itQuacks = new Q30(5);
		System.out.print(itQuacks.getDuckies());
	}

	
	

}
