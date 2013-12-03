package com.shuffle.grammer;

/**
 * @ClassName: TestIncrementAndDecrement
 * @Description: 自增自减运算符
 * @version : 1.0
 * @date 2013-8-12 上午11:25:33
 * @author sunzhongyi szy1944@gmail.com
 */
public class TestIncrementAndDecrement {

	public static void main(String[] args) {
		int i1 = 10, i2 = 20;
		int i = i2++;
		System.out.print("i=" + i);
		System.out.println(" i2=" + i2);
		i = ++i2;
		System.out.print("i=" + i);
		System.out.println(" i2=" + i2);
		i = --i1;
		System.out.print("i=" + i);
		System.out.println(" i1=" + i1);
		i = i1--;
		System.out.print("i=" + i);
		System.out.println(" i1=" + i1);
	}

}
