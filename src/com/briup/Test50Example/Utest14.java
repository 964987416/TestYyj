package com.briup.Test50Example; 

import java.util.Calendar;
import java.util.Date;

/** 
 * @author yyj 
 * @version CreateTime：2018年10月31日 下午2:34:26 
 * 输入某年某月某日，判断这一天是这一年的第几天？
 */
public class Utest14 {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();//创建一个日期实例

		c.setTime(new Date());//实例化一个日期

		System.out.println("今天是全年的第"+c.get(Calendar.DAY_OF_YEAR)+"天");//获取是第多少天

		System.out.println("这周是"+c.get(Calendar.WEEK_OF_YEAR)+"周");//获取是第几周
		
		
		
	}
	

}
 