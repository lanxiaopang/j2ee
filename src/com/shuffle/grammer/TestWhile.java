package com.shuffle.grammer;

/**
 * @ClassName: TestWhile
 * @Description: whileѭ�� & do whileѭ��
 * @version : 1.0
 * @date 2013-8-12 ����9:08:31
 * @author sunzhongyi szy1944@gmail.com
 */
public class TestWhile {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
	}

}
