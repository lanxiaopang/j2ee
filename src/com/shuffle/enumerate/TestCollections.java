package com.shuffle.enumerate;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List l1 = new LinkedList();
		List l2 = new LinkedList();
		// ��ֵ
		for (int i = 0; i < 9; i++) {
			l1.add("a" + i);
		}
		// �������
		Collections.shuffle(l1);
		System.out.println(l1);
		// ��ת
		Collections.reverse(l1);
		System.out.println(l1);
		// ����
		Collections.sort(l1);
		System.out.println(l1);
		// �۰����
		System.out.println(Collections.binarySearch(l1, "a0"));
	}

}
