package com.shuffle.grammer;

public class TestEx {

	/**
	 * @Title: main
	 * @Description: ArrayIndexOutOfBoundsException
	 * @param args
	 * @return void
	 * @author sunzhongyi
	 * @throws
	 */
	public static void main(String[] args) {
		int [] arr = {1,2,3};
		try {
			System.out.println(arr[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("系统正在维护....");
		}
	}

}
