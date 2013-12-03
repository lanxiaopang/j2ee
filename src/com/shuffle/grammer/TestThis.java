package com.shuffle.grammer;

public class TestThis {

	int i = 0;

	TestThis(int i) {
		this.i = i;// 在类的方法定义中使用this关键字代表使用该方法的对象的引用 ，
					//有时使用this可以处理方法中成员变量和参数重名的情况
	}

	TestThis increament() {
		i++;
		return this;//this可以看作是一个变量，他的值是当前对象的引用
	}
	
	void print(){
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		TestThis t = new TestThis(100);
		t.increament().increament().print();
	}

}
