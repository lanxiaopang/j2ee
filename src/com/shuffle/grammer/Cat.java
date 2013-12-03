package com.shuffle.grammer;

/**
 * @ClassName: Cat
 * @Description: 用来测似乎Static关键字
 * @version : 1.0
 * @date 2013-8-16 下午1:48:06
 * @author sunzhongyi szy1944@gmail.com
 */
public class Cat {
	
	private static int sid = 0;
	private String name;
	int id ;
	Cat(String name){
		this.name = name;
		id = sid++;
	}
	public void info(){
		System.out.println("my name is " + this.name + "No."+this.id);
	}
	
	public static void main(String[] args) {
		Cat.sid = 100;
		Cat mimi = new Cat("mimi");
		Cat pipi = new Cat("pipi");
		mimi.info();
		pipi.info();
	}

}
