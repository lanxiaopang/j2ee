package com.shuffle.grammer;

/**
 * @ClassName: DivisibleByThree
 * @Description: 1到100前5个可以被3整除的数
 * @version : 1.0
 * @date 2013-8-12 下午9:24:30
 * @author sunzhongyi szy1944@gmail.com
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		int j = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
				j++;
			}
			if (j == 5)
				break;
		}
	}

}
