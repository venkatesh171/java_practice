package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class SomeCollectionsType {
	public static void main(String[] arr) {
		HashSet<String> set = new HashSet<>();
		set.add("Venkatesh");
		set.add("Hello World!");
		set.add("Be Cool");
		
		System.out.println("Using Hash Set");
		for(String s: set) {
			System.out.println(s);
		}
		
		LinkedHashSet<String> set1 = new LinkedHashSet<>();
		set1.add("Venkatesh");
		set1.add("Hello World!");
		set1.add("Be Cool");
		
		System.out.println("\nUsing Linked Hash Set");
		for(String s: set1) {
			System.out.println(s);
		}
		
		TreeSet<String> set2 = new TreeSet<>();
		set2.add("Venkatesh");
		set2.add("Hello World!");
		set2.add("Be Cool");
		System.out.println("\nUsing Tree Set");
		for(String s: set2) {
			System.out.println(s);
		}
	}
}
