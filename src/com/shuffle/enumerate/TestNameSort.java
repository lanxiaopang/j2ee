package com.shuffle.enumerate;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestNameSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List l1 = new LinkedList();
		l1.add(new Name("Steven","li"));
		l1.add(new Name("Steven","Li"));
		l1.add(new Name("Steven","sun"));
		l1.add(new Name("Hash","li"));
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
	}

}
