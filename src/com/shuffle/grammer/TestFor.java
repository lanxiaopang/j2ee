package com.shuffle.grammer;

public class TestFor {

	/**
	 * @Title: main
	 * @Description: forÑ­»·10µÄ½×³Ë
	 * @param args
	 * @return void
	 * @author sunzhongyi
	 * @throws
	 */
	public static void main(String[] args) {
		long result = 0;
		long f = 1;
		for(int i = 1;i<=10;i++){
			f=f*i;
			result +=f;
		}
		System.out.println(result);
	}

}
