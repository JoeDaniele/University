package aLee2;

import java.util.HashMap; // import hashmap to main 

public class HashMap1 { // class
	public static void main(String[] args) { // main

		HashMap<String, Integer> hash = new HashMap<String, Integer>(); //
		hash.put("Joe", 26);
		hash.put("Frank", 61);
		hash.put("Claudius", 51);

		System.out.println(hash);
		System.out.println(hash.get("Joe"));
		System.out.println(hash.containsValue(26)); // prints boolean
		
		System.out.println(hash.get("Claduius"));
		System.out.println(hash.containsValue(51));
		
	}
}
