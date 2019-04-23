package com.briup.Test50Example; 

import java.util.regex.Pattern;

/** 
 * @author yyj 
 * @version CreateTime：2018年10月31日 下午4:45:15 
 * 给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 */
public class Utest24 {

	public static void Function(int n){
		StringBuffer sb = new StringBuffer();
		sb.append(n);
		String str = sb.toString();
		
		char [] c = str.toCharArray();
		System.out.println(n+"是"+c.length+"位数");
		
		for(int i = c.length-1;i>=0;i--){
			System.out.print(c[i]);
		}
			
		
		
	}
	public static void main(String[] args) {
		Function(12345);
	}
	
}
 