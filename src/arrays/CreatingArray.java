package arrays;


public class CreatingArray {
	
	public static void main(String[] arr) {
		String[]  names = new String[10];
		
		names[0] = "venky";
		names[1] = "ram";
		
		for(int index = 0; index < names.length; index++) {
			if(names[index] != null) {
				System.out.println(names[index]);
			}
		}
		
		System.out.println("now printing using while loop");
		
		int index = 0;
		
		while (index < names.length) {
			if(names[index] != null) {
				System.out.println(names[index]);
			}
			index ++;
		}
		
		System.out.println("now printing using forEach loop");
		
		for(String name : names) {
			if(name != null) {
				System.out.println(name);
			}
		}
		
	}

}
