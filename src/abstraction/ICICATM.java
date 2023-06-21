package abstraction;

public class ICICATM implements ATM{
	public void withDraw() {
		System.out.println("this is for ICIC ATM");
	}
	
	public int returnBalance() {
		return 25;
	}
	
	public void hello() {
		System.out.println("hello world");
	}
}

