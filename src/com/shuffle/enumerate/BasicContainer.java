package com.shuffle.enumerate;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class BasicContainer {

	/**
	 * 本例为展示Collection的基本用法以及Set和List的区别，Set不可以重复且没顺序，List可以重复且有顺序
	 */
	public static void main(String[] args) {
		Collection c1 = new HashSet();
		c1.add("hello");
		c1.add("hello");
		c1.add(new Name("f1", "l2"));
		c1.add(new Integer(100));
		c1.remove("hello1");
		System.out.println(c1);

		Collection c2 = new LinkedList();
		c2.add("hello");
		c2.add("hello");
		c2.add(new Name("f1", "l2"));
		c2.add(new Integer(100));
		c2.remove("hello1");
		System.out.println(c2);
	}

}

class Name implements Comparable<Object> {
	private String firstName, lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Name) {
			Name name = (Name) obj;
			return (firstName.equals(name.firstName) && lastName
					.equals(name.lastName));
		}

		return super.equals(obj);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return firstName.hashCode();
	}

	@Override
	public int compareTo(Object o) {
		Name n = (Name) o;
		int lastCmp = lastName.compareTo(n.lastName);

		return lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName);
	}

}