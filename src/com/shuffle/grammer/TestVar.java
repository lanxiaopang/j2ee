package com.shuffle.grammer;

/**
 * @ClassName: TestVar
 * @Description: 变量的定义声明
 * @version : 1.0
 * @date 2013-8-12 上午9:56:02
 * @author sunzhongyi szy1944@gmail.com
 */
public class TestVar {

	static int j;

	public void m() {
		int i = 0;
		System.out.println(i);
	}

	public static void main(String[] args) {
		int i = 0;
		System.out.println(i);
		System.out.println(j);

		boolean b = false;
		if (b) {
			@SuppressWarnings("unused")
			int c = 0;
			System.out.println("b is true");
		}

		@SuppressWarnings("unused")
		long longNum = 8888888;
	}

}
