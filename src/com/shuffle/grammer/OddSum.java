package com.shuffle.grammer;

public class OddSum {

	/**
	 * @Title: main
	 * @Description: 100以内奇数求和 1+3+5+...+99
	 * @param args
	 * @return void
	 * @author sunzhongyi
	 * @throws
	 */
	public static void main(String[] args) {
		int result = 0;
		for(int i = 1;i<=100;i = i+2){
			result += i;
		}
		System.out.println(result);
	}

}
