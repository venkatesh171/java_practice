package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {
	public static void main(String[] arr) {
		//Creating different kinds of maps 
		//Like sets in maps there is hash  map, linked hash map, and tree map
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Venkatesh");
		map.put(2, "Hello");
		map.put(2, "World");
		
		Set<Entry<Integer, String>> set = map.entrySet();
		System.out.println(map);
		System.out.println("printing entire map values after converting to set");
		System.out.println(set);
		
		System.out.println("iterating map set using for loop");
		for(Entry<Integer, String> en: set) {
			System.out.println(en.getKey()+"--"+en.getValue());
		}
	}
}
