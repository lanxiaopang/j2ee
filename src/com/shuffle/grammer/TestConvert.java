package com.shuffle.grammer;

/**
 * @ClassName: TestConvert
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @version : 1.0
 * @date 2013-8-12 上午9:56:48
 * @author sunzhongyi szy1944@gmail.com
 */
public class TestConvert {

	public static void main(String[] args) {
		int i1 = 123;
		int i2 = 456;
		double d1 = (i1 + i2) * 1.2;// 系统将会转化double类型
		// float f1 = (i1 + i2) * 1.2;//系统会报错，不能将double转化为float
		float f1 = (float) ((i1 + i2) * 1.2);// 需要加强制转换
		byte b1 = 1, b2 = 2;
		byte b3 = (byte) (b1 + b2);// 系统将转换为int类型，需要强制转换为byte

		double d2 = 1e200;
		float f2 = (float) d2;// 会产生溢出
		System.out.println(f2);

		float f3 = 1.23f;// 必须加f
		long l1 = 123;
		long l2 = 80000000000l;// 必须加l
		float f = l1 + l2 + f3;//系统会转化为float运算
		System.out.println(f);
		long l = (long)f;//强制转换会舍弃小数部分（不是四舍五入）
		System.out.println(l);
	}

}
