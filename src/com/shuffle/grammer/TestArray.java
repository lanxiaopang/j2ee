package com.shuffle.grammer;

public class TestArray {

	/**
	 * @Title: main
	 * @Description: 一维数组定义及遍历
	 * @param args
	 * @return void
	 * @author sunzhongyi
	 * @throws
	 */
	public static void main(String[] args) {
		int[] s = new int[5];
		for (int i = 0; i < 5; i++) {
			s[i] = 2*i +1;
		}
		for(int i = 0; i<5;i++){
			System.out.println("s"+i+":"+s[i]);
		}
		for (int x : s) {
			System.out.println("s"+x+":"+x);
		}
	}
}