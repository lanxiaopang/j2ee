package com.shuffle.enumerate;

public class TestEnum {
	public enum MyColor{red,green,blue}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyColor m=MyColor.red;
		switch(m){
		case red:
			System.out.println("red");
			break;
		
		case green:
			System.out.println("green");
			break;
		case blue:
			System.out.println("blue");
			break;
		}
	}
}
