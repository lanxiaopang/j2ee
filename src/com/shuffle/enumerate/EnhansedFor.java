package com.shuffle.enumerate;

import java.util.ArrayList;
import java.util.Collection;

public class EnhansedFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		for(int i:arr){
			System.out.println(i);
		}
		
		Collection<String> c = new ArrayList<String>();
		c.add("111");
		c.add("222");
		c.add("333");
		c.add("333");
		for(String a:c){
			System.out.println(a);
		}
	}

}
