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

		// ����һ��Ԫ��
		li.add(3, "a100");
		System.out.println(li);

		// set�������ص���֮ǰ���λ����Ԫ�ص�ֵ��
		String a = (String) li.set(6, "a200");
		System.out.println(a);
		System.out.println(li);
		
		System.out.println((String)li.get(2));
		System.out.println(li.indexOf("a3"));
		System.out.println(li.indexOf("a400"));//���ȡ�������Ԫ���򷵻�-1
		
		li.remove(1);
		System.out.println(li);

	}
}
