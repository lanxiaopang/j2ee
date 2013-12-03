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
		// 赋值
		for (int i = 0; i < 9; i++) {
			l1.add("a" + i);
		}
		// 随机排列
		Collections.shuffle(l1);
		System.out.println(l1);
		// 反转
		Collections.reverse(l1);
		System.out.println(l1);
		// 排序
		Collections.sort(l1);
		System.out.println(l1);
		// 折半查找
		System.out.println(Collections.binarySearch(l1, "a0"));
	}

}
