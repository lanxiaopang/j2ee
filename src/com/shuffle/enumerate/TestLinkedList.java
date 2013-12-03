package com.shuffle.enumerate;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List li = new LinkedList();
		for (int i = 0; i <= 5; i++) {
			li.add("a" + i);
		}
		System.out.println(li);

		// 增加一个元素
		li.add(3, "a100");
		System.out.println(li);

		// set方法返回的是之前这个位置上元素的值；
		String a = (String) li.set(6, "a200");
		System.out.println(a);
		System.out.println(li);
		
		System.out.println((String)li.get(2));
		System.out.println(li.indexOf("a3"));
		System.out.println(li.indexOf("a400"));//如果取不到这个元素则返回-1
		
		li.remove(1);
		System.out.println(li);

	}
}
