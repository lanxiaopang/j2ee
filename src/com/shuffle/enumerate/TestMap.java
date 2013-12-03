package com.shuffle.enumerate;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		Map<String, Integer> m2 = new TreeMap<String, Integer>();
		m1.put("one", new Integer(1));
		m1.put("two", new Integer(2));
		m1.put("three", new Integer(3));
		m2.put("A", new Integer(1));
		m2.put("B", new Integer(2));
		System.out.println(m1.size());
		System.out.println(m1.containsKey("one"));
		System.out.println(m2.containsValue(new Integer(2)));
		if (m1.containsKey("one")) {
			int i = (Integer) m1.get("one").intValue();
			System.out.println(i);
		}
		Map m3 = new HashMap(m1);
		m3.putAll(m2);
		System.out.println(m3);
	}
}
