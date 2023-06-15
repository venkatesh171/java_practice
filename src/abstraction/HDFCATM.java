package abstraction;

public class HDFCATM implements ATM {
	public void withDraw() {
		System.out.println("this method is using interface calling");
	}
	public int returnBalance() {
		return 20;
	}
}
