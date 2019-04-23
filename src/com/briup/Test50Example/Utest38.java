package com.briup.Test50Example; 

import java.util.Scanner;

/** 
 * @author yyj 
 * @version CreateTime：2018年11月7日 下午2:50:17 
 *写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
 */
public class Utest38 {
	

	
	public static void main(String[] args) {
		System.out.println("请输入一行字符串");
		@SuppressWarnings("resource")
		Scanner scanner  = new Scanner(System.in).useDelimiter("\\n");; 
		String str = scanner.next();
		System.out.println("你输入字符串的长度是"+(str.length()-1));
	}
	
}
 