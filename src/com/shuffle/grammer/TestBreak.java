package com.shuffle.grammer;

/**
 * @ClassName: TestBreak
 * @Description: break
 * @version : 1.0
 * @date 2013-8-12 обнГ9:11:47
 * @author sunzhongyi szy1944@gmail.com
 */
public class TestBreak {
	public static void main(String[] args) {
		int stop = 4;
		for (int i = 0; i < 5; i++) {
			if (i == stop)
				break;
			System.out.println("i=" + i);
		}
	}

}
