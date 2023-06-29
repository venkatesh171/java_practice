package collections;

import java.util.ArrayList;
import java.util.List;

public class TestLists {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add(1);
		list.add("venkatesh");
		list.add(false);
		list.add(123.456);
		
		System.out.println("This is a list of multiple data types");
		for(Object l: list) {
			System.out.println(l);
		}
		
		List<String> list1 = new ArrayList<>();
		list1.add("1");
		list1.add("venkatesh");
		list1.add("false");
		list1.add("123.456");
		
		System.out.println("This is a list of String data type");
		for(Object l: list1) {
			System.out.println(l);
		}
	}

}
