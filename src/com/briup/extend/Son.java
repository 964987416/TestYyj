package com.briup.extend; 
/** 
 * @author yyj 
 * @version CreateTime：2018年2月11日 上午10:34:02 
 * 
 * 
 */
public class Son extends Father {
	public void say(){
		
		System.out.println("I'am son");
	}
	
	public static void main(String[] args) {
		Father f = new Son();
		f.say();
		Son s = new Son();
		s.say();
	}

}
 