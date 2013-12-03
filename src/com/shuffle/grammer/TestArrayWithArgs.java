package com.shuffle.grammer;

public class TestArrayWithArgs {

	/**
	 * @Title: main
	 * @Description: 带参数的一维数组遍历
	 * @param args
	 * @return void
	 * @author sunzhongyi
	 * @throws
	 */
	public static void main(String[] args) {
		int[] s = null;
		
		for(int i = 0; i<args.length;i++){
			System.out.println("args"+i+":"+args[i]);
		}
		
	}
}