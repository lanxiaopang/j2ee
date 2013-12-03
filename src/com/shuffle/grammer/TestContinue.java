package com.shuffle.grammer;

/**
 * @ClassName: TestContinue
 * @Description: Continue
 * @version : 1.0
 * @date 2013-8-12 обнГ9:11:47
 * @author sunzhongyi szy1944@gmail.com
 */
public class TestContinue {
	public static void main(String[] args) {
		int skip = 4;
		for (int i = 0; i < 5; i++) {
			if (skip == i)
				continue;
			System.out.println("i=" + i);
		}
	}

}
