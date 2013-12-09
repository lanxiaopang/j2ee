/** 
 * @Title: Time.java
 * @Package com.inspur.smartSch.presentation.util
 * @Description: TODO(用一句话描述该文件做什么)
 * @author sunzhongyi szy1944@gmail.com 
 * @date 2013-12-9 下午07:51:30
 * @version V1.0 
 */
package com.shuffle.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName: Time
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @version : 1.0
 * @date 2013-12-9 下午07:51:30
 * @author sunzhongyi szy1944@gmail.com
 */
public class Time {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void
	 * @author sunzhongyi
	 * @throws
	 */
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式

		String hehe = dateFormat.format( now );
		System.out.println(hehe);

		Calendar c = Calendar.getInstance();//可以对每个时间域单独修改

		int year = c.get(Calendar.YEAR);
		c.add(Calendar.MONTH, -1);
		int i = c.get(Calendar.MONTH)+1;
		System.out.println("i:"+i);
		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println(year + "/" + month + "/" + date + " " +hour + ":" +minute + ":" + second);
	}

}
