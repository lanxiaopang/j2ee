package com.shuffle.grammer;

/**
 * @ClassName: TestConvert
 * @Description: TODO(������һ�仰��������������)
 * @version : 1.0
 * @date 2013-8-12 ����9:56:48
 * @author sunzhongyi szy1944@gmail.com
 */
public class TestConvert {

	public static void main(String[] args) {
		int i1 = 123;
		int i2 = 456;
		double d1 = (i1 + i2) * 1.2;// ϵͳ����ת��double����
		// float f1 = (i1 + i2) * 1.2;//ϵͳ�ᱨ�����ܽ�doubleת��Ϊfloat
		float f1 = (float) ((i1 + i2) * 1.2);// ��Ҫ��ǿ��ת��
		byte b1 = 1, b2 = 2;
		byte b3 = (byte) (b1 + b2);// ϵͳ��ת��Ϊint���ͣ���Ҫǿ��ת��Ϊbyte

		double d2 = 1e200;
		float f2 = (float) d2;// ��������
		System.out.println(f2);

		float f3 = 1.23f;// �����f
		long l1 = 123;
		long l2 = 80000000000l;// �����l
		float f = l1 + l2 + f3;//ϵͳ��ת��Ϊfloat����
		System.out.println(f);
		long l = (long)f;//ǿ��ת��������С�����֣������������룩
		System.out.println(l);
	}

}
