package com.shuffle.enumerate;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<Name> c = new LinkedList<Name>();
		c.add(new Name("f1", "l1"));
		c.add(new Name("f2", "l2"));
		System.out.println(c.contains(new Name("f1", "l1")));
		c.remove(new Name("f1", "l1"));
		System.out.println(c);
		Iterator<Name> it = c.iterator();
		while (it.hasNext()) {
			Name n = (Name) it.next();
			System.out.println(n.getFirstName() + n.getLastName());
		}
	}

}
