package com.nt.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateInHashMap {

	public static void main(String[] args) {

		// create one HashMap
		HashMap<Integer, String> hashmap = new HashMap<>();

		// add elements to the map
		hashmap.put(01, "Apple");
		hashmap.put(02, "meta");
		hashmap.put(03, "Google");
		hashmap.put(04, "meta"); // meta
		hashmap.put(05, "Insta"); // duplicate
		hashmap.put(06, "MicroSoft");
		hashmap.put(07, "Insta");

		// print the original element
		System.out.println("\n1.The original elements in HashMap:" + hashmap);

		Map<String, Long> values = hashmap.values().stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("The duplicate elements in the Map :" + values);

	}

}
