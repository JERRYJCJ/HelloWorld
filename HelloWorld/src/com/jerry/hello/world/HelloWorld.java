package com.jerry.hello.world;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		
		Date date=new Date();
		Calendar cl=Calendar.getInstance();
		
		
		System.out.println ("this is hello world sample - jerry ");
		 
		System.out.println("upload to git server - 08Jan 001");
  
		
		System.out.println ("java program is running at minute " + cl.getTime() + " ------" + date.getMinutes());

		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		
		
	}

}
