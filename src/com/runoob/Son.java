package com.runoob; 
/** 
 * @author yyj 
 * @version CreateTime：2019年1月15日 下午1:50:47 
 * 
 */
public class Son extends Father {
	
	public void name(){
		System.out.println("我是儿子");
	}
	public static void main(String[] args) {
	//子类中有子类的方法调用子类的name方法	
	Son s = new Son();	
	s.name();
	//new的对象是子类就调用子类的方法
	Father f = new Son();
	f.name();
	//new的对象是父类调用父类的name方法
	Father f1 = new Father();
	f1.name();
	
	}
}
 