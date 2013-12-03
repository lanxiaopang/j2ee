package com.shuffle.grammer;

public class Primes {

	/**
	 * @Title: main
	 * @Description: 100~200之间的质数
	 * @param args
	 * @return void
	 * @author sunzhongyi
	 * @throws
	 */
	public static void main(String[] args) {
//		int i = 101;	102的时候不行i不自增
//		while(i<=200){
//			boolean f = true;
//			for(int j = 2;j<i;j++){
//				if(i%j==0){
//					f = false;
//					break;
//				}
//			}
//			if(!f){continue;}
//			System.out.println(i);
//			i++;
//		}
		for(int i = 101;i<200;i++){
			boolean f =true;
			for(int j = 2;j<i;j++){
				if(i%j==0){
					f = false;
					break;
				}
			}
			if(!f){continue;}
			System.out.println(i);
		}
	}

}
