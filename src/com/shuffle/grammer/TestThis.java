package com.shuffle.grammer;

public class TestThis {

	int i = 0;

	TestThis(int i) {
		this.i = i;// ����ķ���������ʹ��this�ؼ��ִ���ʹ�ø÷����Ķ�������� ��
					//��ʱʹ��this���Դ������г�Ա�����Ͳ������������
	}

	TestThis increament() {
		i++;
		return this;//this���Կ�����һ������������ֵ�ǵ�ǰ���������
	}
	
	void print(){
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		TestThis t = new TestThis(100);
		t.increament().increament().print();
	}

}
