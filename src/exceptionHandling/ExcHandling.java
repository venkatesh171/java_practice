package exceptionHandling;

public class ExcHandling {
	
	public static void main(String [] arr) {
		float res = division(10, 0);
		System.out.println("division result = "+res);
		
		int r = convertStringIntToInt("abc");
		System.out.println(r);
	}
	
	private static float division(int num1, int num2) {
		float result = 0;
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("division can't be performed on 0");
		}
		return result;
	}
	
	private static int convertStringIntToInt(String n) {
		int result = 0;
		try {
			result = Integer.parseInt(n);
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
		}
		return result;
	}
}
