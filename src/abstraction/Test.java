package abstraction;

public class Test {
	
	public static void main(String[] arg) {
		Calculation cal = new Calculation();
		
//		Using java method overloading
		System.out.println(cal.sum(1, 2));
		System.out.println(cal.sum(2, 3, 5));
		System.out.println(cal.sum((float) 2.5, (float) 2.8));
		
//		Using interface
		ATM atm  = new HDFCATM();
		atm.withDraw();
	}

}
